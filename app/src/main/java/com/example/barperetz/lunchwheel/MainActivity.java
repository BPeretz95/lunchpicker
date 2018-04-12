package com.example.barperetz.lunchwheel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
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

        imageButton1.setOnClickListener(new OnClickListener() {

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
            imageButton3.setOnClickListener(new OnClickListener() {

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
                    imageButton4.setOnClickListener(new OnClickListener() {

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
                        imageButton2.setOnClickListener(new OnClickListener() {

                            @Override
                            public void onClick(View arg0) {
                                TextView nameView4 = findViewById(R.id.textView2);
                                String[] italiannames = getResources().getStringArray(R.array.italian);
                                int randomIndex = new Random().nextInt(italiannames.length);
                                String randomItalianName = italiannames[randomIndex];
                                nameView4.setText(randomItalianName);

                            }


                        });}

                    {
                    ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
                    imageButton5.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            TextView nameView5 = findViewById(R.id.textView2);
                            String [] fastfoodnames = getResources().getStringArray(R.array.fastfood);
                            int randomIndex = new Random().nextInt(fastfoodnames.length);
                            String randomFastName = fastfoodnames[randomIndex];
                            nameView5.setText(randomFastName);
                        }

                        {
                     ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
                     imageButton6.setOnClickListener(new OnClickListener() {
                         @Override
                         public void onClick(View view) {
                             TextView nameView6 = findViewById(R.id.textView2);
                             String [] sitdownnames = getResources().getStringArray(R.array.sitdown);
                             int randomIndex = new Random().nextInt(sitdownnames.length);
                             String randomSitNames = sitdownnames[randomIndex];
                             nameView6.setText(randomSitNames);
                         }

                         {
                      ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
                      imageButton7.setOnClickListener(new OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              TextView nameView7 = findViewById(R.id.textView2);
                              String [] drinknames = getResources().getStringArray(R.array.drinks);
                              int randomIndex = new Random().nextInt(drinknames.length);
                              String randomDrinkNames = drinknames[randomIndex];
                              nameView7.setText(randomDrinkNames);
                          }

                          {
                       ImageButton imagebutton8 = (ImageButton) findViewById(R.id.imageButton8);
                       imagebutton8.setOnClickListener(new OnClickListener() {
                           @Override
                           public void onClick(View view) {
                               TextView nameView8 = findViewById(R.id.textView2);
                               String [] latenames = getResources().getStringArray(R.array.late);
                               int randomIndex = new Random().nextInt(latenames.length);
                               String randomLateNames = latenames[randomIndex];
                               nameView8.setText(randomLateNames);
                           }
                       });

                          }
                      });
                         }
                     });
                        }
                    });
                    }
                    {
                        final TextView detailclick = (TextView) findViewById(R.id.textView2);
                        detailclick.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent myIntent = new Intent(view.getContext(), RestaurantDetail.class);
                                myIntent.putExtra(String.valueOf(R.id.textView2), detailclick.getText().toString());
                                startActivityForResult(myIntent, 0);
                            }
                        });
                }}}});}}




