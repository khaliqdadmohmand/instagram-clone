package com.emericoapp.instagram.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.emericoapp.instagram.R;


public class DashboardFragment extends Fragment {

    private ProgressBar progressBar;
    private RecyclerView recyclerViewParent;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        recyclerViewParent = root.findViewById(R.id.parent_apps_recycler_view);
        progressBar =root.findViewById(R.id.appScreenProgress);
        recyclerViewParent.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());

        recyclerViewParent.setLayoutManager(layoutManager);



        return root;
    }




}