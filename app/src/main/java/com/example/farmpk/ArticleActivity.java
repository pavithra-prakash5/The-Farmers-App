package com.example.farmpk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ArticleActivity extends AppCompatActivity {
    ImageView organicFarming, bioFertilizer, climateChange, drought, verticalFarming;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        //Nav Bar -- start
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.article:
                    return true;
                case R.id.home:
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.crop_care:
                    startActivity(new Intent(getApplicationContext(), CropcareActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
            }
            return false;

        });
        //Nav bar -- end
        organicFarming = findViewById(R.id.organic);
        bioFertilizer = findViewById(R.id.biofer);
        climateChange = findViewById(R.id.climate);
        drought = findViewById(R.id.drought);
        verticalFarming = findViewById(R.id.vertical);

        organicFarming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArticleActivity.this, OrganicFarmingActivity.class);
                startActivity(intent);
            }
        });
        bioFertilizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArticleActivity.this, BioFertilizerActivity.class);
                startActivity(intent);
            }
        });
        climateChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArticleActivity.this, ClimateChangeActivity.class);
                startActivity(intent);
            }
        });
        drought.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArticleActivity.this, DroughtActivity.class);
                startActivity(intent);
            }
        });
        verticalFarming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArticleActivity.this, VerticalFarmingActivity.class);
                startActivity(intent);
            }
        });
    }
}