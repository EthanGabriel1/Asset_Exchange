package com.example.assetexchange;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.cardview.widget.CardView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MyBottomSheetFragment extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.new_asset_layout, container, false);

        // Find the addedlist_container in the layout
        CardView addedListContainer = view.findViewById(R.id.Added_lists_container);

        // Set click listener to show the BottomSheet_AddedLists
        addedListContainer.setOnClickListener(v -> {
            BottomSheet_AddedLists bottomSheetAddedLists = new BottomSheet_AddedLists();
            bottomSheetAddedLists.show(getParentFragmentManager(), bottomSheetAddedLists.getTag());
        });

        // Find the btn_back_sendIt in the layout
        Button btnBackSendIt = view.findViewById(R.id.btn_back_newasset);

        // Set click listener on the back button to close the bottom sheet
        btnBackSendIt.setOnClickListener(v -> {
            // Close the bottom sheet
            dismiss();
        });

        return view;
    }
}
