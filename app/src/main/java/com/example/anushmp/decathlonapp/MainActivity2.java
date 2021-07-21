package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    // Urls of our images.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Slideme();

    }
private void Slideme(){
    // we are creating array list for storing our image urls.
    ArrayList<slide_item> sliderDataArrayList = new ArrayList<>();

    // initializing the slider view.
    SliderView sliderView = findViewById(R.id.imageSlider);

    // adding the urls inside array list
    sliderDataArrayList.add(new slide_item("https://gcdn.bookvip.com/bookvip/bookvip_en/static/hotels/652/o_1d7tgbonc5t3112u82e68lf8ef.jpg"));
    sliderDataArrayList.add(new slide_item("https://gcdn.bookvip.com/bookvip/bookvip_en/static/hotels/652/o_1d7tgbonc5t3112u82e68lf8ef.jpg"));
    sliderDataArrayList.add(new slide_item("https://gcdn.bookvip.com/bookvip/bookvip_en/static/hotels/652/o_1d7tgbonc5t3112u82e68lf8ef.jpg"));

    // passing this array list inside our adapter class.
    SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);

    // below method is used to set auto cycle direction in left to
    // right direction you can change according to requirement.
    sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

    // below method is used to
    // setadapter to sliderview.
    sliderView.setSliderAdapter(adapter);

    // below method is use to set
    // scroll time in seconds.
    sliderView.setScrollTimeInSec(3);

    // to set it scrollable automatically
    // we use below method.
    sliderView.setAutoCycle(true);

    // to start autocycle below method is used.
    sliderView.startAutoCycle();
}
}