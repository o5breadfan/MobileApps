package com.example.photogallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import java.util.ArrayList;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.photogallery.Photo;
import com.example.photogallery.Response;
import com.example.photogallery.RViewAdapter;
import com.example.photogallery.R;
import com.example.photogallery.ServiceAPI;
import com.example.photogallery.FlickRecent;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class PhotoGallery extends AppCompatActivity {

    RViewAdapter adapter;
    Context context;
    Response responses;
    PhotosDB db;
    List<Photo> photos;
    PhotosDao photoDao;
    TextView image_name;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_activity);
        final RecyclerView recyclerView = findViewById(R.id.recyclerV);
        //photoDao = db.getDatabase(context).photoDao();
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        Retrofit retrofit = ServiceAPI.getRetrofit();
        context=this;
        retrofit.create(FlickRecent.class).getRecent().enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                responses = response.body();
                List<Photo> photos = responses.getPhotos().getPhoto();
                adapter = new RViewAdapter(photos,context, photoDao);
                recyclerView.setAdapter(adapter);
                Toast.makeText(PhotoGallery.this, "GOOD REQUEST",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Toast.makeText(PhotoGallery.this, "BAD REQUEST",Toast.LENGTH_SHORT).show();
            }
        });
        //db = Room.databaseBuilder(context,PhotosDB.class,"database").allowMainThreadQueries().build();
       // photoDao = db.getDatabase(context).photoDao();
        //list = items;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.search_menu, menu);
            MenuItem item = menu.findItem(R.id.menuSearch);
            SearchView searchView = (SearchView)item.getActionView();
            final RecyclerView recyclerView = findViewById(R.id.recyclerV);
            recyclerView.setLayoutManager(new GridLayoutManager(this,3));
            Retrofit retrofit = ServiceAPI.getRetrofit();
            context=this;
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    retrofit.create(FlickRecent.class).getSearchPhotos(query).enqueue(new Callback<Response>() {
                        @Override
                        public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                            responses = response.body();
                            List<Photo> photos = responses.getPhotos().getPhoto();
                            adapter = new RViewAdapter(photos,context, photoDao);
                            recyclerView.setAdapter(adapter);
                            Toast.makeText(PhotoGallery.this, "GOOD REQUEST",Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onFailure(Call<Response> call, Throwable t) {
                            Toast.makeText(PhotoGallery.this, "BAD REQUEST",Toast.LENGTH_SHORT).show();
                        }
                    });
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    return false;
                }

            });
            return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
       /*int id = item.getItemId();
        if(id == R.id.LocalDB){
            photos = photoDao.LoadAll();
            for(int i = 0; i < photos.size(); i++){
                String text = photos.get(i).getOwner();
                image_name.setText(text);
                Picasso.with(context).load(photos.get(i).getUrl_s()).into(image);
            }
        }*/
        return true;
    }
}