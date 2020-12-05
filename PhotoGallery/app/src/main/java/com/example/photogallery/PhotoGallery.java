package com.example.photogallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.os.Bundle;
import android.widget.Toast;
import com.example.photogallery.Photo;
import com.example.photogallery.Response;
import com.example.photogallery.RViewAdapter;
import com.example.photogallery.R;
import com.example.photogallery.ServiceAPI;
import com.example.photogallery.FlickRecent;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class PhotoGallery extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Photo> photos = new ArrayList<>();
    RViewAdapter adapter;
    private String zapros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_activity);
        recyclerView = findViewById(R.id.recyclerV);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        zapros = null;
        photo_items(zapros);
    }

    private void photo_items(String query){
        FlickRecent flickRecent = ServiceAPI.getRetrofit().create(FlickRecent.class);
        Call<Response> call;
        if(query == null){
            call = flickRecent.getRecent();
        }
        else{
            zapros = query;
            call = flickRecent.getSearchPhotos(query);
        };
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                if(response.isSuccessful()){
                    Response photoResponse = response.body();
                    photos = photoResponse.getPhotos().getPhoto();
                    Toast.makeText(PhotoGallery.this,"Good connection",Toast.LENGTH_SHORT).show();
                    adapter = new RViewAdapter(photos);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Toast.makeText(PhotoGallery.this, "Bad Connection",Toast.LENGTH_SHORT).show();
            }
        });
    }
}