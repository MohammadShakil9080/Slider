package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlider = findViewById(R.id.imageSlider);


        ArrayList<SlideModel>slideModels  = new ArrayList<>();



        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2BteuF2", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/3fLJf72", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2BteuF2", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/3fLJf72", ScaleTypes.FIT));                                        



        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
    }
}