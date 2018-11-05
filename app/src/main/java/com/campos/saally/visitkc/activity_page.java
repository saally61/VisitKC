package com.campos.saally.visitkc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;


import org.w3c.dom.Text;


public class activity_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        Intent intent = getIntent();

        TextView title = (TextView) findViewById(R.id.textViewTitle);
        String theTitle = intent.getStringExtra("Name");
        title.setText(theTitle);

        TextView description = (TextView) findViewById(R.id.textViewDescription);
        String theDescription = intent.getStringExtra("Description");
        description.setText(theDescription);
        description.setMovementMethod(new ScrollingMovementMethod());


        TextView address = (TextView) findViewById(R.id.textViewAddress);
        String theAddress = intent.getStringExtra("Address");
        address.setText(theAddress);

        TextView phone = (TextView) findViewById(R.id.textViewPhone);
        String thePhone = intent.getStringExtra("Phone");
        phone.setText(thePhone);

        TextView web = (TextView) findViewById(R.id.textViewWebsite);
        String theWebsite = intent.getStringExtra("Website");
        web.setText(theWebsite);

        TextView price = (TextView) findViewById(R.id.textViewPrice);
        String thePrice = intent.getStringExtra("Price");
        price.setText(thePrice);

        TextView hours = (TextView) findViewById(R.id.textViewHours);
        String theHours = intent.getStringExtra("Hours");
        hours.setText(theHours);

        TextView email = (TextView) findViewById(R.id.textViewEmail);
        String theEmail = intent.getStringExtra("Email");
        email.setText(theEmail);

    }
}
