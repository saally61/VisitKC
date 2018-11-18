package com.campos.saally.visitkc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActivityListAdapter extends ArrayAdapter<Activity> {
    private static final String TAG = "ActivityListAdapter";
    private Context mContext;
    int mResource;

    public ActivityListAdapter(Context context, int resource, ArrayList<Activity> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Gets the view and attaches to the list view

        //get information
        String name = getItem(position).getName();
        String priceRange = getItem(position).getPrice_range();
        //int image = getItem(position).getImage();
        int image = getItem(position).getImage();

        //Create the Activity
        //Activity act = new Activity(name);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        //Create textview items and set values
        TextView tvName = (TextView) convertView.findViewById(R.id.textView2);

        tvName.setText(name);


        ImageView myIV = (ImageView) convertView.findViewById(R.id.MainimageView);
        myIV.setImageResource(image);

        return convertView;
    }
}
