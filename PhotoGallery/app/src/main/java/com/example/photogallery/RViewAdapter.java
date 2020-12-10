package com.example.photogallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;
import com.example.photogallery.Photo;
import com.example.photogallery.Photos;

public class RViewAdapter extends RecyclerView.Adapter<RViewAdapter.PhotoHolder> {
   private List<Photo> list;
   private ImageView image;
   private TextView image_name;

   public RViewAdapter(List<Photo> items) {
       list = items;
   }

    public class PhotoHolder extends RecyclerView.ViewHolder{
        ImageView image;
      // final TextView image_name;
       public PhotoHolder(View item){
           super(item);
           image = item.findViewById(R.id.imageView);
           image_name = item.findViewById(R.id.phono_name);
       }
    }

    @NonNull
    @Override
    public RViewAdapter.PhotoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_photo,parent,false);
       return new PhotoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoHolder holder, int position) {
        Photo photo = list.get(position);
        String text = photo.getOwner();
        image_name.setText(text);
        Picasso.get().load(photo.url_s).into(image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
