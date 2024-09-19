package com.example.assetexchange;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet_NewList extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.new_list, container, false);

        // Find the cancel button
        Button btnCancelList = view.findViewById(R.id.btn_cancel_list);

        // Set click listener on the cancel button to dismiss the bottom sheet
        btnCancelList.setOnClickListener(v -> {
            // Close the bottom sheet
            dismiss();
        });

        return view;
    }
}
