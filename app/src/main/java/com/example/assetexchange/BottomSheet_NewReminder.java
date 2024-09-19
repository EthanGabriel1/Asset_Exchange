package com.example.assetexchange;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.cardview.widget.CardView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheet_NewReminder extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.new_remind, container, false);

        // Find the back button
        Button btnBackReminder = view.findViewById(R.id.btn_back_reminder);

        // Set click listener on the back button to dismiss the bottom sheet
        btnBackReminder.setOnClickListener(v -> {
            // Close the bottom sheet
            dismiss();
        });

        // Find Others_container_reminder in new_remind.xml
        CardView othersContainerReminder = view.findViewById(R.id.others_container_reminder);

        // Set click listener to show reminder_others bottom sheet
        othersContainerReminder.setOnClickListener(v -> {
            BottomSheet_Reminder_Others bottomSheetOthers = new BottomSheet_Reminder_Others();
            bottomSheetOthers.show(getParentFragmentManager(), bottomSheetOthers.getTag());
        });

        // Find Added_lists_container in new_remind.xml
        CardView addedListsContainer = view.findViewById(R.id.Added_lists_container);

        // Set click listener to show added_lists bottom sheet
        addedListsContainer.setOnClickListener(v -> {
            BottomSheet_AddedLists bottomSheetAddedLists = new BottomSheet_AddedLists();
            bottomSheetAddedLists.show(getParentFragmentManager(), bottomSheetAddedLists.getTag());
        });

        return view;
    }
}
