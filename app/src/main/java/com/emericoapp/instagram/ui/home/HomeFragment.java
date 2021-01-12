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

import com.emericoapp.instagram.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class HomeFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        textView.setText("Home");

        Button btnSheet = root.findViewById(R.id.btn_bottom_sheet);

        btnSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            toggleBottomSheet();
            }
        });


        return root;
    }


    public void toggleBottomSheet(){

        View view = getLayoutInflater().inflate(R.layout.fragment_bottom_sheet, null);

        LinearLayout call = view.findViewById(R.id.layout_call);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Call","Call is clicked...!!");
            }
        });

        BottomSheetDialog dialog = new BottomSheetDialog(getActivity());
        dialog.setContentView(view);
        dialog.show();
    }

}