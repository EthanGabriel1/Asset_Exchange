package com.example.assetexchange;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class All_Tasks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_tasks);

        Button showBottomSheetButton = findViewById(R.id.btn_remind);
        showBottomSheetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheet_NewReminder bottomSheet = new BottomSheet_NewReminder();
                bottomSheet.show(getSupportFragmentManager(), bottomSheet.getTag());
            }
        });

        // Find the ImageButton by its ID
        ImageButton backButton = findViewById(R.id.back_all_tasks);

        // Set OnClickListener on the ImageButton
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the MainActivity
                Intent intent = new Intent(All_Tasks.this, MainActivity.class);
                startActivity(intent);
                // Optionally finish the current activity
                finish();
            }
        });
    }
}
