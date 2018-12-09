package com.campos.saally.visitkc;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;

public class Filters extends AppCompatActivity {

    ArrayList<FilterItem> FilterList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filters);
        Intent intent = getIntent();
        ListView FilterListView = (ListView) findViewById(R.id.FilterListView);
        generate_filters();

        FilterRowAdapter adapter = new FilterRowAdapter(this, R.layout.activity_filters, FilterList);
        FilterListView.setAdapter(adapter);
    }

    public void generate_filters(){
        FilterItem f1 = new FilterItem("Shopping", 0);
        FilterItem f2 = new FilterItem("Animals", 0);
        FilterItem f3 = new FilterItem("Teens", 0);
        FilterItem f4 = new FilterItem("Adults", 0);
        FilterItem f5 = new FilterItem("Entertainment", 0);
        FilterItem f6 = new FilterItem("Movies", 0);
        FilterItem f7 = new FilterItem("Outdoor", 0);
        FilterItem f8 = new FilterItem("Art", 0);
        FilterItem f9 = new FilterItem("Free", 0);
        FilterItem f10 = new FilterItem("School", 0);
        FilterItem f11 = new FilterItem("Fun", 0);
        FilterItem f12 = new FilterItem("Kids", 0);
        FilterItem f13 = new FilterItem("Halloween", 0);
        FilterItem f14 = new FilterItem("All Day", 0);
        FilterItem f15 = new FilterItem("Family", 0);
        FilterItem f16 = new FilterItem("Events", 0);
        FilterItem f17 = new FilterItem("Hotel", 0);
        FilterItem f18 = new FilterItem("Food", 0);
        FilterItem f19 = new FilterItem("Clothes", 0);
        FilterItem f20 = new FilterItem("Shoes", 0);
        FilterItem f21 = new FilterItem("Indoor", 0);


        FilterList.add(f1);
        FilterList.add(f2);
        FilterList.add(f3);
        FilterList.add(f4);
        FilterList.add(f5);
        FilterList.add(f6);
        FilterList.add(f7);
        FilterList.add(f8);
        FilterList.add(f9);
        FilterList.add(f10);
        FilterList.add(f11);
        FilterList.add(f12);
        FilterList.add(f13);
        FilterList.add(f14);
        FilterList.add(f15);
        FilterList.add(f16);
        FilterList.add(f17);
        FilterList.add(f18);
        FilterList.add(f19);
        FilterList.add(f20);
    }



}
