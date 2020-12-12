package com.example.photogallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import android.content.Context;
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
import retrofit2.Retrofit;

public class PhotoGallery extends AppCompatActivity {

    RViewAdapter adapter;
    Context context;
    Response responses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_activity);
        final RecyclerView recyclerView = findViewById(R.id.recyclerV);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        Retrofit retrofit = ServiceAPI.getRetrofit();
        context=this;
       /* retrofit.create(FlickRecent.class).getSearchPhotos("cats").enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                responses = response.body();
                List<Photo> photos = responses.getPhotos().getPhoto();
                adapter = new RViewAdapter(photos,context);
                recyclerView.setAdapter(adapter);
                Toast.makeText(PhotoGallery.this, "GOOD REQUEST",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Toast.makeText(PhotoGallery.this, "BAD REQUEST",Toast.LENGTH_SHORT).show();
            }
        });*/
        retrofit.create(FlickRecent.class).getRecent().enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                responses = response.body();
                List<Photo> photos = responses.getPhotos().getPhoto();
                adapter = new RViewAdapter(photos,context);
                recyclerView.setAdapter(adapter);
                Toast.makeText(PhotoGallery.this, "GOOD REQUEST",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Toast.makeText(PhotoGallery.this, "BAD REQUEST",Toast.LENGTH_SHORT).show();
            }
        });
    }
}