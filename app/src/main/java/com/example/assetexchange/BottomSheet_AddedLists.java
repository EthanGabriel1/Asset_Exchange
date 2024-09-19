package com.example.assetexchange;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet_AddedLists extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.added_lists, container, false);

        // Find the cancel button
        Button btnCancelAddedLists = view.findViewById(R.id.btn_cancel_added_lists);

        // Set click listener on the cancel button to close the bottom sheet
        btnCancelAddedLists.setOnClickListener(v -> {
            // Close the bottom sheet
            dismiss();
        });

        return view;
    }
}
