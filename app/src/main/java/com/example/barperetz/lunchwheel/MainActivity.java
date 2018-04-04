package com.example.barperetz.lunchwheel;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        addListenerOnButton();



    }

    public void addListenerOnButton() {

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                TextView nameView1 = findViewById(R.id.textView2);
                String[] americannames = getResources().getStringArray(R.array.american);
                int randomIndex = new Random().nextInt(americannames.length);
                String randomAmericanName = americannames[randomIndex];
                nameView1.setText(randomAmericanName);

            }
            {
         ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
            imageButton2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    TextView nameView2 = findViewById(R.id.textView2);
                    String[] asiannames = getResources().getStringArray(R.array.asian);
                    int randomIndex = new Random().nextInt(asiannames.length);
                    String randomAsianName = asiannames[randomIndex];
                    nameView2.setText(randomAsianName);
                }
        });

    }

});}}