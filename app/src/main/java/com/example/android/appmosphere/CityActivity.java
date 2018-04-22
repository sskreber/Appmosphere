package com.example.android.appmosphere;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class CityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        //Creating ArrayList to contain our playlist
        ArrayList<Song> songs = new ArrayList<Song>();
        //These below are all existing audio files under the listed author name at environment.ambient-mixer.com
        songs.add(new Song("\"DuruAntilles\":", "Victorian London"));
        songs.add(new Song("\"mariuseus\":", "Chinatown"));
        songs.add(new Song("\"Veruca\":", "A London flat"));
        songs.add(new Song("\"Elariat\":", "Aqueduct sewers"));
        songs.add(new Song("\"AgentsOfTheValley\":", "Bustling town centre"));
        songs.add(new Song("\"Pebbles\":", "Sleazy hotel in New Orleans"));
        songs.add(new Song("\"raresound\":", "Rush hour"));
        songs.add(new Song("\"Kazuhira\":", "Jazzy cyberpunk city"));

        // creating & setting custom arraylist adapter on playlist that'll list all songs within the category
        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.playlist);
        listView.setAdapter(adapter);

        /* setting category-specific background image
        Source: "architectural-design-architecture-buildings-city-373893" by Burst at www.pexels.com
         */
        listView.setBackground(ContextCompat.getDrawable(this, R.drawable.metropolis));

        /* Hooking up the return button */
        ImageButton returnButton = (ImageButton) findViewById(R.id.button_return);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnToMainActivity = new Intent(CityActivity.this, MainActivity.class);
                startActivity(returnToMainActivity);
            }
        });
    }
}
