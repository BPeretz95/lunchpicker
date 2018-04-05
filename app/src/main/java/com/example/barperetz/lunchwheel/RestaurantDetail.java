package com.example.barperetz.lunchwheel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Bar Peretz on 4/5/2018.
 */

public class RestaurantDetail extends MainActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurantdetail);
        TextView txtView = (TextView) findViewById(R.id.textViewDetail);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null)
        {
            String restaurant = (String) bd.get(String.valueOf(R.id.textView2));
            txtView.setText(restaurant);
        }
    }





    }





