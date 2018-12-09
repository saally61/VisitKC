package com.campos.saally.visitkc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FilterRowAdapter extends ArrayAdapter<FilterItem> {
    private Context mContext;
    int mResource;

    public FilterRowAdapter(Context context, int resource, ArrayList<FilterItem> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Gets the view and attaches to the list view
        String name = getItem(position).getFilterName();
        //int switchval = getItem(position).getFilterSwitch();
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView title = (TextView) convertView.findViewById(R.id.FilterPageItem);
        title.setText(name);

        //Switch theSwitch = (Switch) convertView.findViewById(R.id.FilterOnOffSwitch);

        return convertView;
    }
}
