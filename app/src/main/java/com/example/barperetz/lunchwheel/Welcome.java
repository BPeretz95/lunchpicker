package com.example.barperetz.lunchwheel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Bar Peretz on 4/13/2018.
 */

public class Welcome extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcomepage);

        ImageButton button = (ImageButton) findViewById(R.id.imageButtonWelcome);
        final Context context = this;
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }}
