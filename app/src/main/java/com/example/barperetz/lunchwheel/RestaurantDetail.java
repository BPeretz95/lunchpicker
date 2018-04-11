package com.example.barperetz.lunchwheel;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static java.lang.String.valueOf;

/**
 * Created by Bar Peretz on 4/5/2018.
 */

public class RestaurantDetail extends MainActivity {



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurantdetail);
        final Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null)
        {
            final String restaurant = (String) bd.get(valueOf(R.id.textView2));
            String hours;
            final TextView textViewDetail = (TextView) findViewById(R.id.textViewDetail);
            final TextView textViewHours = (TextView) findViewById(R.id.textViewHours);
            textViewDetail.setText(restaurant);

            if(textViewDetail.getText().toString().equals("Teriyaki Madness")) {
                hours = "10AM - 10PM";
                textViewHours.setText(hours);

            }
            if(textViewDetail.getText().toString().equals("Bangkok Orchid")) {
                hours = "11AM - 10PM";
                textViewHours.setText(hours);

            }

            


            textViewDetail.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    String url = "https://www.google.com/";


                   if(textViewDetail.getText().toString().equals("Teriyaki Madness")) {
                       url = "http://teriyakimadness.com/menu/";

                    }

                   if(textViewDetail.getText().toString().equals("Bangkok Orchid")) {
                       url = "http://www.menusearch.net/lasvegas/restaurant.php?name=511";

                   }

                   if(textViewDetail.getText().toString().equals("Blue Fin Sushi")) {
                       url = "https://www.allmenus.com/nv/las-vegas/387275-blue-fin-sushi/menu/";

                   }

                   if(textViewDetail.getText().toString().equals("Panda Express")) {
                       url = "https://www.pandaexpress.com/menu";

                   }

                   if(textViewDetail.getText().toString().equals("Ross J Aloha Grill")) {
                       url = "https://www.yelp.com/biz/ross-js-aloha-grill-henderson";

                   }

                   if(textViewDetail.getText().toString().equals("Fukumimi Ramen")) {
                       url = "https://www.yelp.com/biz/fukumimi-ramen-las-vegas";

                   }

                   if(textViewDetail.getText().toString().equals("China Wan Wan")) {
                       url = "http://www.chinawanwannv.com/menu.aspx";

                   }

                   if(textViewDetail.getText().toString().equals("Chicken Shack")) {
                       url = "https://mychickenshack.com/";

                   }

                   if(textViewDetail.getText().toString().equals("Black Bear Diner")) {
                       url = "https://blackbeardiner.com/menus/";

                   }

                   if(textViewDetail.getText().toString().equals("Wendys")) {
                       url = "https://menu.wendys.com/en_US/categories/";

                   }

                   if(textViewDetail.getText().toString().equals("Carls Jr")) {
                       url = "https://www.carlsjr.com/menu-sitemap";

                   }

                   if(textViewDetail.getText().toString().equals("Sonic")) {
                       url = "https://www.sonicdrivein.com/menu";

                   }

                   if(textViewDetail.getText().toString().equals("Fatburger")) {
                       url = "https://www.fatburger.com/menu/";

                   }

                   if(textViewDetail.getText().toString().equals("McDonalds")) {
                       url = "https://www.mcdonalds.com/us/en-us/full-menu.html";

                   }

                   if(textViewDetail.getText().toString().equals("Freddys")) {
                       url = "https://freddysusa.com/menu/";

                   }

                   if(textViewDetail.getText().toString().equals("In n Out")) {
                       url = "http://www.in-n-out.com/menu.aspx";

                   }

                   if(textViewDetail.getText().toString().equals("Sin City Smokers")) {
                       url = "http://www.sincitysmokers.com/restaurant";

                   }

                   if(textViewDetail.getText().toString().equals("Marie Callendars")) {
                       url = "https://www.mariecallenders.com/menu";

                   }

                   if(textViewDetail.getText().toString().equals("Red Robin")) {
                       url = "http://www.rrburgerworks.com/menu";

                   }

                   if(textViewDetail.getText().toString().equals("Jimmy Johns")) {
                       url = "https://www.jimmyjohns.com/menu/#/";

                   }

                   if(textViewDetail.getText().toString().equals("Cappriottis")) {
                       url = "https://www.capriottis.com/shop-menu/";

                   }
                   if(textViewDetail.getText().toString().equals("Robertos Taco Shop")) {
                       url = "http://robertostacoshop.com/menu/";

                   }

                   if(textViewDetail.getText().toString().equals("Cafe Rio")) {
                       url = "https://www.caferio.com/menu";

                   }

                   if(textViewDetail.getText().toString().equals("Taco Bell")) {
                       url = "https://www.tacobell.com/food";

                   }

                   if(textViewDetail.getText().toString().equals("El Pollo Loco")) {
                       url = "http://www.elpolloloco.com/our-food/";

                   }

                   if(textViewDetail.getText().toString().equals("Del Taco")) {
                       url = "https://deltaco.com/menu";

                   }

                   if(textViewDetail.getText().toString().equals("Olive Garden")) {
                       url = "https://www.olivegarden.com/home";

                   }

                   if(textViewDetail.getText().toString().equals("Pizza Hutt")) {
                       url = "https://www.pizzahut.com/?gclid=Cj0KCQjwtZzWBRD2ARIsAIPenY345LTer5ddE_DnlRaPef9o17RVWMUvxnrnrN8sonGEpNzsc5Y9PgYaAsuLEALw_wcB&gclsrc=aw.ds&dclid=CJ7Uqq3nptoCFdVnfgodo3sAHw";

                   }

                   if(textViewDetail.getText().toString().equals("Dominos")) {
                       url = "https://www.dominos.com/en/pages/order/menu.jsp?utm_campaign=69796710|c|GG&utm_source=Google&utm_medium=p_search&utm_content=kwd-24470291|69796710|21980500710&utm_term=dominos&matchtype=e#/menu/category/all/";

                   }

                   if(textViewDetail.getText().toString().equals("Papa Johns")) {
                       url = "https://www.papajohns.com/order/menu";

                   }

                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }



            });


            }


        }


    }












        // Continue adding If statements for value of textView2
        // Open link/display page based on value.













