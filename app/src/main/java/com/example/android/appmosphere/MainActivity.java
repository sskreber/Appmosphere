package com.example.android.appmosphere;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Setting the content of the activity to activity_main.xml
        setContentView(R.layout.activity_main);

        // Finding the view belonging to the nature category
        TextView nature = (TextView) findViewById(R.id.nature);

        // Setting an OnClickListener on it
        nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Creating a new intent to open NatureActivity
                Intent natureIntent = new Intent(MainActivity.this, NatureActivity.class);
                // Starting the new activity
                startActivity(natureIntent);
            }
        });

        // Finding the view belonging to the city category
        TextView city = (TextView) findViewById(R.id.city);

        // Setting an OnClickListener on it
        city.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Creating a new intent to open CityActivity
                Intent cityIntent = new Intent(MainActivity.this, CityActivity.class);
                // Starting the new activity
                startActivity(cityIntent);
            }
        });

        // Finding the view belonging to the fiction category
        TextView fiction = (TextView) findViewById(R.id.fiction);

        final String sendingActivity = "";

        // Setting an OnClickListener on it
        fiction.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Creating a new intent to open FictionActivity
                Intent fictionIntent = new Intent(MainActivity.this, FictionActivity.class);
                // Starting the new activity
                startActivity(fictionIntent);
            }
        });


    }
}
