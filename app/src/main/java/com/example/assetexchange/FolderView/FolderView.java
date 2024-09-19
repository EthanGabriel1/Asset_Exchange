package com.example.assetexchange.FolderView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import com.example.assetexchange.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class FolderView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folder_view);

        // Find the add folder button (use ImageButton instead of Button)
        ImageButton btnAddFolder = findViewById(R.id.btn_add_folder);

        // Set click listener on the add folder button
        btnAddFolder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create and show the BottomSheet_NewFolder
                BottomSheetDialogFragment bottomSheetNewFolder = new BottomSheet_NewFolder();
                bottomSheetNewFolder.show(getSupportFragmentManager(), bottomSheetNewFolder.getTag());
            }
        });
    }
}
