package com.emericoapp.instagram.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.emericoapp.instagram.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    
    ArrayList images;
    Context context;

    public CustomAdapter(ArrayList images, Context context) {
        this.images = images;
        this.context = context;
    }


    @Override
    public MyViewHolder  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.imageView.setImageResource((Integer) images.get(position));
    }


    @Override
    public int getItemCount() {
        return images.size();
    }
    
    
    public class MyViewHolder extends RecyclerView.ViewHolder{
        
        ImageView imageView;
        public MyViewHolder(View view){
            super((view));
            imageView = view.findViewById(R.id.image);
        }
    }
}
