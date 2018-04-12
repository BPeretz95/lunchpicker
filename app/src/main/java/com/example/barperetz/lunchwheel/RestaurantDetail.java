package com.example.barperetz.lunchwheel;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.ImageView;
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
        if (bd != null) {
            final String restaurant = (String) bd.get(valueOf(R.id.textView2));
            String hours;
            String contact;
            final TextView textViewContact = (TextView) findViewById(R.id.textViewContact);
            final TextView textViewDetail = (TextView) findViewById(R.id.textViewDetail);
            final TextView textViewHours = (TextView) findViewById(R.id.textViewHours);
            ImageView imageViewRestaurant = (ImageView) findViewById(R.id.imageViewRestaurant);
            textViewDetail.setText(restaurant);

            if (textViewDetail.getText().toString().equals("Teriyaki Madness")) {
                hours = "10AM - 10PM";
                contact = "(702) 202-2744";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.madness);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Bangkok Orchid")) {
                hours = "11AM - 10PM";
                contact = "(702) 458-4945";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.orchid);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Blue Fin Sushi")) {
                hours = "11AM - 11PM";
                contact = "(725) 696-7428";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.sushi);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Panda Express")) {
                hours = "10AM - 10:30PM";
                contact = "(702) 435-9950";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.pandaexpress);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Ross J Aloha Grill")) {
                hours = "10AM - 8PM";
                contact = "(702) 435-5600";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.rossj);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Fukumimi Ramen")) {
                hours = "11:30AM - 10PM";
                contact = "(702) 631-2933";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.ramen);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("China Wan Wan")) {
                hours = "11AM - 9:30PM";
                contact = "(702) 866-0768";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.chinese);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Chicken Shack")) {
                hours = "10AM - 9PM";
                contact = "(702) 456-2669";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.chickenshack);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Black Bear Diner")) {
                hours = "6AM - 10PM";
                contact = "(725) 333-6805";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.blackbear);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Wendys")) {
                hours = "9AM - 1AM";
                contact = "(702) 458-0093";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.wendys);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Carls Jr")) {
                hours = "6AM - 10PM";
                contact = "(702) 458-5601";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.carlsjr);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Sonic")) {
                hours = "6AM - 12AM";
                contact = "(702) 898-9559";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.sonic);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Fatburger")) {
                hours = "9AM - 10PM";
                contact = "(702) 547-5535";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.fatburger);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("McDonalds")) {
                hours = "24Hrs";
                contact = "(702) 454-3485";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.mcdonalds);
                textViewContact.setText(contact);
            }
            if (textViewDetail.getText().toString().equals("Freddys")) {
                hours = "10:30AM - 10PM";
                contact = "(702) 834-7143";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.freddys);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("In n Out")) {
                hours = "10:30AM - 1AM";
                contact = "(800) 786-1000";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.innout);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Sin City Smokers")) {
                hours = "10AM - 8PM";
                contact = "(702) 823-5605";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.sincitysmokers);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Marie Callendars")) {
                hours = "7AM - 10PM";
                contact = "(702) 450-9820";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.callenders);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Red Robin")) {
                hours = "11AM - 10PM";
                contact = "(702) 547-1777";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.redrobin);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Jimmy Johns")) {
                hours = "11AM - 9PM";
                contact = "(702) 558-0510";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.jimmyjohns);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Cappriottis")) {
                hours = "10AM - 8PM";
                contact = "(702) 898-4904";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.capps);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Robertos Taco Shop")) {
                hours = "24Hrs";
                contact = "(702) 898-3333";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.robertos);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Cafe Rio")) {
                hours = "10:30AM - 10PM";
                contact = "(702) 701-5100";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.rio);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Taco Bell")) {
                hours = "7AM - 2AM";
                contact = "(702) 436-0080";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.tacobell);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("El Pollo Loco")) {
                hours = "10AM - 11PM";
                contact = "(702) 450-5886";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.polloloco);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Del Taco")) {
                hours = "7AM - 12AM";
                contact = "(702) 436-6606";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.deltaco);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Olive Garden")) {
                hours = "11AM - 10PM";
                contact = "(702) 451-5133";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.olivegarden);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Pizza Hutt")) {
                hours = "10:30AM - 11PM";
                contact = "702) 451-9011";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.pizzahut);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Dominos")) {
                hours = "10AM - 12AM";
                contact = "(702) 435-3030";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.dominos);
                textViewContact.setText(contact);

            }
            if (textViewDetail.getText().toString().equals("Papa Johns")) {
                hours = "10AM - 12AM";
                contact = "(702) 433-6262";
                textViewHours.setText(hours);
                imageViewRestaurant.setImageResource(R.drawable.papajohns);
                textViewContact.setText(contact);

            }


            textViewDetail.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    String url = "https://www.google.com/";


                    if (textViewDetail.getText().toString().equals("Teriyaki Madness")) {
                        url = "http://teriyakimadness.com/menu/";

                    }

                    if (textViewDetail.getText().toString().equals("Bangkok Orchid")) {
                        url = "http://www.menusearch.net/lasvegas/restaurant.php?name=511";

                    }

                    if (textViewDetail.getText().toString().equals("Blue Fin Sushi")) {
                        url = "https://www.allmenus.com/nv/las-vegas/387275-blue-fin-sushi/menu/";

                    }

                    if (textViewDetail.getText().toString().equals("Panda Express")) {
                        url = "https://www.pandaexpress.com/menu";

                    }

                    if (textViewDetail.getText().toString().equals("Ross J Aloha Grill")) {
                        url = "https://www.yelp.com/biz/ross-js-aloha-grill-henderson";

                    }

                    if (textViewDetail.getText().toString().equals("Fukumimi Ramen")) {
                        url = "https://www.yelp.com/biz/fukumimi-ramen-las-vegas";

                    }

                    if (textViewDetail.getText().toString().equals("China Wan Wan")) {
                        url = "http://www.chinawanwannv.com/menu.aspx";

                    }

                    if (textViewDetail.getText().toString().equals("Chicken Shack")) {
                        url = "https://mychickenshack.com/";

                    }

                    if (textViewDetail.getText().toString().equals("Black Bear Diner")) {
                        url = "https://blackbeardiner.com/menus/";

                    }

                    if (textViewDetail.getText().toString().equals("Wendys")) {
                        url = "https://menu.wendys.com/en_US/categories/";

                    }

                    if (textViewDetail.getText().toString().equals("Carls Jr")) {
                        url = "https://www.carlsjr.com/menu-sitemap";

                    }

                    if (textViewDetail.getText().toString().equals("Sonic")) {
                        url = "https://www.sonicdrivein.com/menu";

                    }

                    if (textViewDetail.getText().toString().equals("Fatburger")) {
                        url = "https://www.fatburger.com/menu/";

                    }

                    if (textViewDetail.getText().toString().equals("McDonalds")) {
                        url = "https://www.mcdonalds.com/us/en-us/full-menu.html";

                    }

                    if (textViewDetail.getText().toString().equals("Freddys")) {
                        url = "https://freddysusa.com/menu/";

                    }

                    if (textViewDetail.getText().toString().equals("In n Out")) {
                        url = "http://www.in-n-out.com/menu.aspx";

                    }

                    if (textViewDetail.getText().toString().equals("Sin City Smokers")) {
                        url = "http://www.sincitysmokers.com/restaurant";

                    }

                    if (textViewDetail.getText().toString().equals("Marie Callendars")) {
                        url = "https://www.mariecallenders.com/menu";

                    }

                    if (textViewDetail.getText().toString().equals("Red Robin")) {
                        url = "http://www.rrburgerworks.com/menu";

                    }

                    if (textViewDetail.getText().toString().equals("Jimmy Johns")) {
                        url = "https://www.jimmyjohns.com/menu/#/";

                    }

                    if (textViewDetail.getText().toString().equals("Cappriottis")) {
                        url = "https://www.capriottis.com/shop-menu/";

                    }
                    if (textViewDetail.getText().toString().equals("Robertos Taco Shop")) {
                        url = "http://robertostacoshop.com/menu/";

                    }

                    if (textViewDetail.getText().toString().equals("Cafe Rio")) {
                        url = "https://www.caferio.com/menu";

                    }

                    if (textViewDetail.getText().toString().equals("Taco Bell")) {
                        url = "https://www.tacobell.com/food";

                    }

                    if (textViewDetail.getText().toString().equals("El Pollo Loco")) {
                        url = "http://www.elpolloloco.com/our-food/";

                    }

                    if (textViewDetail.getText().toString().equals("Del Taco")) {
                        url = "https://deltaco.com/menu";

                    }

                    if (textViewDetail.getText().toString().equals("Olive Garden")) {
                        url = "https://www.olivegarden.com/home";

                    }

                    if (textViewDetail.getText().toString().equals("Pizza Hutt")) {
                        url = "https://www.pizzahut.com/?gclid=Cj0KCQjwtZzWBRD2ARIsAIPenY345LTer5ddE_DnlRaPef9o17RVWMUvxnrnrN8sonGEpNzsc5Y9PgYaAsuLEALw_wcB&gclsrc=aw.ds&dclid=CJ7Uqq3nptoCFdVnfgodo3sAHw";

                    }

                    if (textViewDetail.getText().toString().equals("Dominos")) {
                        url = "https://www.dominos.com/en/pages/order/menu.jsp?utm_campaign=69796710|c|GG&utm_source=Google&utm_medium=p_search&utm_content=kwd-24470291|69796710|21980500710&utm_term=dominos&matchtype=e#/menu/category/all/";

                    }

                    if (textViewDetail.getText().toString().equals("Papa Johns")) {
                        url = "https://www.papajohns.com/order/menu";

                    }

                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }


            });

            textViewContact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:+" + textViewContact.getText().toString().trim()));
                    if (ActivityCompat.checkSelfPermission(RestaurantDetail.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.

                        return;
                    }
                    startActivity(callIntent);


                }
            });


            }


        }


    }












        // Continue adding If statements for value of textView2
        // Open link/display page based on value.













