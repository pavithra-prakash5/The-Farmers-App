package com.example.farmpk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Image Slider -- start
        ImageSlider imageslider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.slide1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide5, ScaleTypes.FIT));
        imageslider.setImageList(slideModels,ScaleTypes.FIT);
        //Image Slider -- end

        //Nav Bar -- start
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    return true;
                case R.id.article:
                    startActivity(new Intent(getApplicationContext(), ArticleActivity.class));
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
        TextView textView = findViewById(R.id.text);
        textView.setText(R.string.bulleted_list);

    TextView textView1 = findViewById(R.id.text1);
        textView1.setText(R.string.PMFBY);

        TextView textView2 = findViewById(R.id.text2);
        textView2.setText(R.string.WBCIS);
        TextView textView3 = findViewById(R.id.text3);
        textView3.setText(R.string.CPIS);
        TextView textView4 = findViewById(R.id.text4);
        textView4.setText(R.string.UPIS);
        TextView textView5 = findViewById(R.id.text5);
        textView5.setText(R.string.PMKSY);
}
}