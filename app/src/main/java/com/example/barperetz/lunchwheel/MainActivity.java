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

        ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);

        imageButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                TextView nameView1 = findViewById(R.id.textView2);
                String[] americannames = getResources().getStringArray(R.array.american);
                int randomIndex = new Random().nextInt(americannames.length);
                String randomAmericanName = americannames[randomIndex];
                nameView1.setText(randomAmericanName);

            }
            {
         ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
            imageButton3.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    TextView nameView2 = findViewById(R.id.textView2);
                    String[] asiannames = getResources().getStringArray(R.array.asian);
                    int randomIndex = new Random().nextInt(asiannames.length);
                    String randomAsianName = asiannames[randomIndex];
                    nameView2.setText(randomAsianName);
                }
        });
                {
                    ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
                    imageButton4.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View arg0) {
                            TextView nameView3 = findViewById(R.id.textView2);
                            String[] taconames = getResources().getStringArray(R.array.mexican);
                            int randomIndex = new Random().nextInt(taconames.length);
                            String randomTacoName = taconames[randomIndex];
                            nameView3.setText(randomTacoName);

                }

    });
                    {
                        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
                        imageButton2.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View arg0) {
                                TextView nameView3 = findViewById(R.id.textView2);
                                String[] italiannames = getResources().getStringArray(R.array.italian);
                                int randomIndex = new Random().nextInt(italiannames.length);
                                String randomItalianName = italiannames[randomIndex];
                                nameView3.setText(randomItalianName);
                            }
                            });}}}});}}

