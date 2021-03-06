package com.campos.saally.visitkc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ArrayList<com.campos.saally.visitkc.Activity> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mainListView = (ListView) findViewById(R.id.activity_list);
        generate_activities();

        ActivityListAdapter adapter = new ActivityListAdapter(this, R.layout.adapter_view_layout, data);
        mainListView.setAdapter(adapter);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, data.get(position).getName() + position, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(view.getContext(), activity_page.class);
                i.putExtra("Name", data.get(position).getName());
                i.putExtra("Address", data.get(position).getAddress());
                i.putExtra("Phone", data.get(position).getPhone_number());
                i.putExtra("Website", data.get(position).getWebsite());
                i.putExtra("Price", data.get(position).getPrice());
                i.putExtra("Range", data.get(position).getPrice_range());
                i.putExtra("Description", data.get(position).getDescription());
                i.putExtra("Hours", data.get(position).getHours());
                i.putExtra("Email", data.get(position).getEmail());
                //i.putExtra("Image", data.get(position).getImage());
                for (int n=0; n<data.get(position).getImages().size(); n++){
                    i.putExtra("Image"+n, data.get(position).getImages().get(n) );
                }
                //i.putExtra("ImageCount", data.get(position).getImages().size() );


                startActivityForResult(i,0);
            }
        });


        Button FilterButton = (Button) findViewById(R.id.FilterButton);
        FilterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFilter();
            }
        });


    }

    public void openFilter(){
        Intent i = new Intent(this, Filters.class);
        this.startActivity(i);
    }

    public ArrayList<FilterItem> FilterListInput = new ArrayList<>();

    public ArrayList<com.campos.saally.visitkc.Activity> FilterActivities(ArrayList<FilterItem> filters, ArrayList<com.campos.saally.visitkc.Activity> TheActivities){
        return TheActivities;
    }

    public void generate_activities(){
        com.campos.saally.visitkc.Activity act2 = new com.campos.saally.visitkc.Activity(
                "Sea Life Aquarium",
                "2475 Grand Blvd. Kansas City, MO 64108",
                "816-471-4386",
                "https://www.visitsealife.com/kansas-city/visit-kc/",
                "$20 adult, $16 child",
                "mid",
                "EXPLORER? Come this way! Step beneath the waves and prepare for a world of glittering " +
                        "scales, darting sharks, gliding stingrays and a curious octopus. And get ready to come " +
                        "face-to-fin with some of the most fascinating creatures. Open daily from 10am. Holiday and peak operating hours do apply, please check website for details."
                );
        act2.setHours("10am to 7pm ");
        act2.setEmail("KCGroups@merlinentertainments.biz");
        act2.addTag(Arrays.asList("School","Kids", "Family","Animals","Indoor"));
        act2.setImage(R.drawable.sealife);
        act2.addImage(Arrays.asList(R.drawable.sealife, R.drawable.sealife1));

        com.campos.saally.visitkc.Activity act3 = new com.campos.saally.visitkc.Activity(
                "KC Zoo",
                "6800 Zoo Dr. Kansas City, MO 64132",
                "816-595-1234",
                "http://www.kansascityzoo.org/",
                "$16 adults $15 senior 55 and older $13 children ages 3-11",
                "mid",
                "More Zoo for you to explore with more than 200 acres of adventure filled with more than 1,700 animals. See penguins like never before at Helzberg Penguin Plaza. Watch king and gentoo penguins torpedo through the water in their 100,000 gallon cool pool and see the Humboldt penguins bask in the sun and get their flippers wet in the 25,000 gallon warm water pool. Journey to the Polar Bear Passage and marvel at our polar bears' beauty and strength. Swing into the Orangutan Canopy and get nose to nose with these orange apes. Take a walk-about through a mob of kangaroos. Climb a meerkat mound. Watch otters whirl. Lumber with elephants. Take a spin on the Endangered Species Carousel, ride the train, then continue the journey on the tram to Africa. Get a birds-eye view of zebras, giraffes and rhinos on the African Sky Safari. Meet two of the most adorable marsupials this side of the equator at Koala Flats, open through November. Polar Bear Passage boasts Midwest Travel Treasure by AAA. An always changing, always fun family experience for all ages. Open daily, year round. It's always a new adventure at the Kansas City Zoo!"
                );
        act3.setHours("Weekdays: 9:30am - 4pm Weekends: 9:30am - 5pm");
        act3.setEmail("askthezoo@fotzkc.org");
        act3.addTag(Arrays.asList("School","Kids","Family","Animals","Outdoor"));
        act3.setImage(R.drawable.kczoo);
        act3.addImage(Arrays.asList(R.drawable.kczoo, R.drawable.kczoo1));

        com.campos.saally.visitkc.Activity act4 = new com.campos.saally.visitkc.Activity(
                "Deanna Rose Children's Farmstead",
                "13800 Switzer, Overland Park, KS 66221",
                "913-897-2360",
                "https://www.opkansas.org/things-to-see-and-do/deanna-rose-childrens-farmstead/",

                "$3/person",
                "low",
                "The Farmstead brings a frontier farm to families living in the city. Visitors can see more than 250 animals and birds, learn about growing flowers and vegetables, or experience an Indian encampment, a one-room country schoolhouse and a turn-of-the-century main street. Parents will treasure memories of children bottle-feeding baby goats, milking cows and riding horse-drawn wagons through the woods."
                );
        act4.setHours("9am-5pm");
        act4.addTag(Arrays.asList("School", "Kids", "Family","Animals", "Outdoor"));
        act4.setImage(R.drawable.deannarose);
        act4.addImage(Arrays.asList(R.drawable.deannarose, R.drawable.deannarose1));


        com.campos.saally.visitkc.Activity act5 = new com.campos.saally.visitkc.Activity(
                "Oak Park Mall",
                "11149 West 95th Street Overland Park, KS 66214",
                "913-888-4400",
                "http://www.thenewoakparkmall.com/",
                "\"Free\n" +
                        "(Mid)\"\t",
                "mid",
                "Browse stores, find deals, and get inspired"
                );
        act5.setHours("10am-9pm");
        act5.addTag(Arrays.asList("Shopping", "Clothes", "Shoes", "Family", "Teens") );
        act5.setImage(R.drawable.oakpark);
        act5.addImage(Arrays.asList(R.drawable.oakpark, R.drawable.oakpark1));


        com.campos.saally.visitkc.Activity act6 = new com.campos.saally.visitkc.Activity(
                "Crown Center ",
                "2450 Grand Boulevard; Kansas City, MO 64108",
                "816-274-8444",
                "https://www.crowncenter.com/",
                "Free",
                "mid/high",
                "Crown Center is the place for pure entertainment. With exciting events and unique attractions. A center full of locally owned shops and restaurants. And two luxury hotels so you can stay at the center of it all. It’s perfectly located, too … right in the heart of Kansas City. If you’re looking for fun things to do, you’ll find them at Crown Center. See you soon."
                );
        act6.setHours("Mon-Sat 10am-7pm Sun 12pm-6pm");
        act6.addTag(Arrays.asList("Shopping", "Family", "Events", "Hotel", "Food") );
        act6.setImage(R.drawable.crowncenter);
        act6.addImage(Arrays.asList(R.drawable.crowncenter, R.drawable.crowncenter1));


        com.campos.saally.visitkc.Activity act7 = new com.campos.saally.visitkc.Activity(
                "Worlds of Fun",
                "4545 Worlds of Fun Ave, Kansas City, MO 64161",
                "816-454-4545",
                "https://www.worldsoffun.com/",
                "~$40\t",
                "high",
                "Worlds of Fun is a 235-acre amusement park. Admission to Worlds of Fun includes access to Oceans of Fun, a water park adjacent to the amusement park."
                );
        act7.addTag(Arrays.asList("Fun", "Kids", "Family", "Teens", "Halloween", "All Day"));
        act7.setImage(R.drawable.wof);
        act7.addImage(Arrays.asList(R.drawable.wof, R.drawable.wof1));


        com.campos.saally.visitkc.Activity act8 = new com.campos.saally.visitkc.Activity(
                "The Nelson-Atkins Museum of Art",
                "4525 Oak St, Kansas City, MO 64111",
                "816-751-1278",
                "https://www.nelson-atkins.org/",
                "Free\t",
                "low",
                "\"Where the power of art engages the spirit of community. The Nelson-Atkins is a gathering place for people to share and contemplate the greatest creations of humankind. Free admission gives everyone the opportunity to enjoy, appreciate and understand the finest visual arts.\n" +
                        "\""
                );
        act8.setHours("10am-5pm");
        act8.setEmail("ask@nelson-atkins.org");
        act8.addTag(Arrays.asList("Free", "Art", "Teens", "Adults", "School"));
        act8.setImage(R.drawable.nelson);
        act8.addImage(Arrays.asList(R.drawable.nelson, R.drawable.nelson1));


        com.campos.saally.visitkc.Activity act9 = new com.campos.saally.visitkc.Activity(
                "Legends Outlet",
                "1843 Village W Pkwy, Kansas City, KS 66109",
                "913-788-3700",
                "https://legendsshopping.com/",
                "free",
                "low",
                "Outdoor shopping mall. 100+ outlets, retail, dining, and entertainment options."
                );
        act9.setHours("\"Mon-Sat 10am-9pm\n" +
                "Sun 11pm-6pm\"");
        act9.setEmail("info@legendsshopping.com");
        act9.addTag(Arrays.asList("Shopping", "Teens", "Adults", "Outdoor", "Movies", "Entertainment"));
        act9.setImage(R.drawable.legends);
        act9.addImage(Arrays.asList(R.drawable.legends, R.drawable.legends1));


        com.campos.saally.visitkc.Activity act10 = new com.campos.saally.visitkc.Activity(
                "Country Club Plaza ",
                "4706 Broadway Blvd, Kansas City, MO 64112",
                "816-753-0100",
                "https://www.countryclubplaza.com/",
                "Free\t",
                "low",
                "LIVE MUSIC Enjoy our free Plaza Live! Courtyard Concerts every Thursday Night from 5-8pm. Busy on Thursday? Grab a drink and enjoy nightly live music at several of our restaurants. HAPPIER HAPPY HOURS The Plaza takes happy hour to new heights, with specials on a dazzling array of beverages and mouthwatering edibles, all at the area’s most popular spots. SHOP YOUR FAVORITE BRANDS Eileen Fisher, Vineyard Vines, Coach, Apple, Kendra Scott. The Country Club Plaza is a historical beacon to commercial developers and still evolving as a beloved destination for Kansas Citians and visitors alike."
                );
        act10.setHours("\"Mon-Wed: 10am-7pm\n" +
                "Thur: 10am-9pm\n" +
                "Fri-Sat: 10am-7pm\n" +
                "Sun: Noon-5pm\n" +
                "Restaurant and store hours may vary\"");
        act10.addTag(Arrays.asList("Shopping", "Teens", "Adults", "Entertainment", "Movies", "Outdoor"));
        act10.setImage(R.drawable.ccplaza);
        act10.addImage(Arrays.asList(R.drawable.ccplaza, R.drawable.ccplaza1));



        data.add(act2);
        data.add(act3);
        data.add(act4);
        data.add(act5);
        data.add(act6);
        data.add(act7);
        data.add(act8);
        data.add(act9);
        data.add(act10);

    }

}
