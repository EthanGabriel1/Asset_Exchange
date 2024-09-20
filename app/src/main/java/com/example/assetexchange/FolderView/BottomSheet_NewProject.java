package com.example.assetexchange.FolderView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.assetexchange.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet_NewProject extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.new_project, container, false);

        // Find the back button
        Button btnBack = view.findViewById(R.id.btn_back_new_project);

        // Set an onClickListener to dismiss the bottom sheet when clicked
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();  // Dismiss the bottom sheet
            }
        });

        // Return the inflated view
        return view;
    }
}
