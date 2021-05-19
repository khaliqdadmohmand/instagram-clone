package com.emericoapp.instagram.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.emericoapp.instagram.R;
import com.emericoapp.instagram.adapter.PostAdapter;
import com.emericoapp.instagram.adapter.StoryAdapter;
import com.emericoapp.instagram.model.PostModel;
import com.emericoapp.instagram.model.StoryModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class HomeFragment extends Fragment {

    RecyclerView storyRecycl, postRecycler;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        storyRecycl = root.findViewById(R.id.story_recycler);

        StoryModel[] storyModels = new StoryModel[]{
                new StoryModel(R.drawable.dog, "Khaliq"),
                new StoryModel(R.drawable.cat, "Izrail"),
                new StoryModel(R.drawable.hamster, "KdTechs"),
                new StoryModel(R.drawable.dog, "Youtube"),
                new StoryModel(R.drawable.cat, "Example"),
                new StoryModel(R.drawable.hamster, "Testing"),
                new StoryModel(R.drawable.dog, "Youtube"),
                new StoryModel(R.drawable.cat, "Example"),
                new StoryModel(R.drawable.hamster, "Testing"),
        };

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        storyRecycl.setLayoutManager(layoutManager);

        StoryAdapter storyAdapter = new StoryAdapter(storyModels);
        storyRecycl.setAdapter(storyAdapter);


        //============================ Post area

        postRecycler = root.findViewById(R.id.post_recycler);
        postRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        postRecycler.setHasFixedSize(true);

        PostModel[] postModels = new PostModel[]{
          new PostModel("Khaliq", R.drawable.dog,R.drawable.dog,"19-05-2021","A Quick brown fox jumps"),
                new PostModel("Izrail", R.drawable.cat,R.drawable.cat,"19-05-2021","a lazy dog"),
                new PostModel("KDtechs", R.drawable.hamster,R.drawable.hamster,"19-05-2021","A Quick brown fox jumps"),
                new PostModel("Khaliq", R.drawable.dog,R.drawable.dog,"19-05-2021","A Quick brown fox jumps"),
                new PostModel("Izrail", R.drawable.cat,R.drawable.cat,"19-05-2021","a lazy dog"),
                new PostModel("KDtechs", R.drawable.hamster,R.drawable.hamster,"19-05-2021","A Quick brown fox jumps"),
        };

        PostAdapter adapter = new PostAdapter(postModels);
        postRecycler.setAdapter(adapter);


        return root;
    }




}