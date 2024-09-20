package com.example.assetexchange.FolderView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.assetexchange.MyBottomSheetFragment;
import com.example.assetexchange.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet_NewFolder extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.new_folder, container, false);

        // Find the btn_new_asset_folder in the inflated view
        Button btnNewAssetFolder = view.findViewById(R.id.btn_new_asset_folder);
        Button btnNewProject = view.findViewById(R.id.btn_new_project); // Find btn_new_project

        // Set a click listener on btn_new_asset_folder
        btnNewAssetFolder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the BottomSheet for new_asset_layout
                MyBottomSheetFragment bottomSheetNewAsset = new MyBottomSheetFragment();
                bottomSheetNewAsset.show(getParentFragmentManager(), bottomSheetNewAsset.getTag());
            }
        });

        // Set a click listener on btn_new_project
        btnNewProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the BottomSheet for new_project
                BottomSheet_NewProject bottomSheetNewProject = new BottomSheet_NewProject();
                bottomSheetNewProject.show(getParentFragmentManager(), bottomSheetNewProject.getTag());
            }
        });

        // Return the inflated view
        return view;
    }
}
