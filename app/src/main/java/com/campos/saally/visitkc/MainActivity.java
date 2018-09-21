package com.campos.saally.visitkc;

import android.app.Activity;
import android.content.Context;
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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Activity items[] = new Activity[] {};
    ArrayList<Activity> data = new ArrayList<Activity>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generate();
        ListView listView = (ListView) findViewById(R.id.activityList);
        ArrayAdapter<Activity> adapter = new ArrayAdapter<Activity>(this, android.R.layout.simple_list_item_activated_1, data);
        listView.setAdapter(adapter);


        //listView.setAdapter(new MyListAdapter(this, R.layout.list_item, data));




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, data.get(position).description + position, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void generate(){
        Activity newAct = new Activity();
        for (int i=0; i<20; i++) {
            newAct.name = "name";
            newAct.description = "Activity #";
            data.add(newAct);
        }
    }

    public class Activity{
        String name;
        String description;
    }
}
