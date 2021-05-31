package com.emericoapp.instagram.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;


import com.emericoapp.instagram.R;
import com.emericoapp.instagram.adapter.CustomAdapter;

import java.util.ArrayList;
import java.util.Arrays;


public class DashboardFragment extends Fragment {

    private RecyclerView recyclerView;

    ArrayList images = new ArrayList<>(Arrays.asList(R.drawable.cat, R.drawable.dog,R.drawable.hamster,R.drawable.test
    , R.drawable.facebook, R.drawable.twitter, R.drawable.instagram, R.drawable.snapchat,R.drawable.cat,
            R.drawable.dog,R.drawable.hamster,R.drawable.test
            , R.drawable.facebook, R.drawable.twitter, R.drawable.instagram, R.drawable.snapchat));

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);


        recyclerView = root.findViewById(R.id.recycler);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        CustomAdapter customAdapter = new CustomAdapter(images, getContext());
        recyclerView.setAdapter(customAdapter);

        return root;
    }

    // to hide the action bar

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }
}