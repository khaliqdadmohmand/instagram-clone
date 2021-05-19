package com.emericoapp.instagram.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.emericoapp.instagram.R;
import com.emericoapp.instagram.model.StoryModel;
import com.mikhaellopez.circularimageview.CircularImageView;

public class StoryAdapter  extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {

    private StoryModel[] listData;

    public StoryAdapter(StoryModel[] listData){
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.story_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final  StoryModel storyModel = listData[position];
        holder.name.setText(storyModel.name);
        holder.imageView.setImageResource(storyModel.image);

    }

    @Override
    public int getItemCount() {
        return listData.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        CircularImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.imageView = itemView.findViewById(R.id.story_image);
            this.name = itemView.findViewById(R.id.story_name);
        }
    }

}
