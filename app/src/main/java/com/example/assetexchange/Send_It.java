package com.example.assetexchange;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetBehavior;


public class Send_It extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_it);





        Button showBottomSheetButton = findViewById(R.id.showBottomSheetButton);
        showBottomSheetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyBottomSheetFragment bottomSheet = new MyBottomSheetFragment();
                bottomSheet.show(getSupportFragmentManager(), bottomSheet.getTag());
            }
        });


    }
}