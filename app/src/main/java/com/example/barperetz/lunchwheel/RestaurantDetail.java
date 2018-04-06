package com.example.barperetz.lunchwheel;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import static java.lang.String.valueOf;

/**
 * Created by Bar Peretz on 4/5/2018.
 */

public class RestaurantDetail extends MainActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurantdetail);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null)
        {
            String restaurant = (String) bd.get(valueOf(R.id.textView2));
            TextView textViewDetail = (TextView) findViewById(R.id.textViewDetail);
            textViewDetail.setText(restaurant);

        }










        }
        // Continue adding If statements for value of textView2
        // Open link/display page based on value.

    }











