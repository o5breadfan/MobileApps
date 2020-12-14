package com.example.photogallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.squareup.picasso.Picasso;
import java.util.List;
import com.example.photogallery.PhotosDB;
import com.example.photogallery.Photo;
import com.example.photogallery.Photos;
import com.example.photogallery.PhotosDao;

public class RViewAdapter extends RecyclerView.Adapter<RViewAdapter.PhotoHolder> {
   private List<Photo> list;
   private ImageView image;
   private TextView image_name;
   PhotosDao photosDao;
   Photos photos;
   //Response response;
   Context context;

   public RViewAdapter(List<Photo> items,Context contexts, PhotosDao photosDaos) {
       list = items;
       this.context = contexts;
       photosDao = photosDaos;
   }

    public class PhotoHolder extends RecyclerView.ViewHolder{
       public PhotoHolder(View item){
           super(item);
           image = item.findViewById(R.id.imageView);
           image_name = item.findViewById(R.id.phono_name);
           item.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                      // db = Room.databaseBuilder(context, PhotosDB.class, "database").allowMainThreadQueries().build();
                       // photoDao = db.photoDao();
                       //list = items;
                        Photo photo = list.get(v.getId());
                        photosDao.insertPhoto(photo);
               }
           });
       }
    }

    @NonNull
    @Override
    public RViewAdapter.PhotoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.recycler_photo,parent,false);
       return new PhotoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoHolder holder, int position) {

        //list = photoDao.LoadAll();
        String text = list.get(position).getOwner();
        image_name.setText(text);
        Picasso.with(context).load(list.get(position).getUrl_s()).into(image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
