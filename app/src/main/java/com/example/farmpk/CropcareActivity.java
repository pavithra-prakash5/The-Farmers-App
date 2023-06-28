package com.example.farmpk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CropcareActivity extends AppCompatActivity {

    CardView blackSpotCard, blightCard, cankerCard, downyMildewCard, otherLeafCard, powderyMildewCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cropcare);

        blackSpotCard = findViewById(R.id.blackSpotCard);
        blightCard = findViewById(R.id.blightCard);
        cankerCard = findViewById(R.id.cankerCard);
        downyMildewCard = findViewById(R.id.downyMildewCard);
        otherLeafCard = findViewById(R.id.otherLeafCard);
        powderyMildewCard = findViewById(R.id.powderyMildewCard);

        blackSpotCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CropcareActivity.this, BlackspotActivity.class);
                startActivity(intent);
            }
        });
        blightCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CropcareActivity.this, BlightActivity.class);
                startActivity(intent);
            }
        });
        cankerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CropcareActivity.this, CankerActivity.class);
                startActivity(intent);
            }
        });
        downyMildewCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CropcareActivity.this, DownymildewActivity.class);
                startActivity(intent);
            }
        });
        otherLeafCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CropcareActivity.this, OtherleafActivity.class);
                startActivity(intent);
            }
        });
        powderyMildewCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CropcareActivity.this, PowderymildewActivity.class);
                startActivity(intent);
            }
        });
        //Nav Bar -- start
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.crop_care:
                    return true;
                case R.id.article:
                    startActivity(new Intent(getApplicationContext(), ArticleActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.home:
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
            }
            return false;

        });
        //Nav bar -- end
    }
}