package com.example.assetexchange.FolderView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.assetexchange.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet_NewFolder extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.new_folder, container, false);

        // Return the inflated view
        return view;
    }
}
