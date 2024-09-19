package com.example.assetexchange;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find the CardView by its ID for Task_All
        CardView taskAllCard = findViewById(R.id.Task_All);

        // Set OnClickListener on the CardView
        taskAllCard.setOnClickListener(v -> {
            // Create an Intent to start the All_Tasks activity
            Intent intent = new Intent(MainActivity.this, All_Tasks.class);
            startActivity(intent);
        });

        // Find the Button by its ID for btnRemind
        Button btnRemind = findViewById(R.id.btnRemind);

        // Set OnClickListener on the Button
        btnRemind.setOnClickListener(v -> {
            // Show the BottomSheet_NewReminder
            BottomSheet_NewReminder bottomSheet = new BottomSheet_NewReminder();
            bottomSheet.show(getSupportFragmentManager(), bottomSheet.getTag());
        });

        // Find the Button by its ID for btnAddList
        Button btnAddList = findViewById(R.id.btnAddList);

        // Set OnClickListener on the Button to show the new_list bottom sheet
        btnAddList.setOnClickListener(v -> {
            // Show the BottomSheet_NewList
            BottomSheet_NewList bottomSheet = new BottomSheet_NewList();
            bottomSheet.show(getSupportFragmentManager(), bottomSheet.getTag());
        });

        // Find the CardView by its ID for Task_Completed
        CardView taskCompletedCard = findViewById(R.id.Task_Completed);

        // Set OnClickListener on the CardView
        taskCompletedCard.setOnClickListener(v -> {
            // Create an Intent to start the Completed_Tasks activity
            Intent intent = new Intent(MainActivity.this, Completed_Tasks.class);
            startActivity(intent);
        });
    }
}
