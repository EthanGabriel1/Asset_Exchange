package com.example.assetexchange;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet_Reminder_Others extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.reminder_others, container, false);

        // Find the back button
        Button btnBackReminderOthers = view.findViewById(R.id.btn_back_reminder_others);

        // Set click listener on the back button to dismiss the bottom sheet
        btnBackReminderOthers.setOnClickListener(v -> {
            // Close the bottom sheet
            dismiss();
        });

        return view;
    }
}
