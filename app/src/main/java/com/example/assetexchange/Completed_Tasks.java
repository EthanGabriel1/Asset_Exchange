package com.example.assetexchange;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Completed_Tasks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_tasks);


        // Find the ImageButton by its ID
        ImageButton backButton = findViewById(R.id.back_completed_tasks);

        // Set OnClickListener on the ImageButton
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the MainActivity
                Intent intent = new Intent(Completed_Tasks.this, MainActivity.class);
                startActivity(intent);
                // Optionally finish the current activity
                finish();
            }
        });
    }



    }
