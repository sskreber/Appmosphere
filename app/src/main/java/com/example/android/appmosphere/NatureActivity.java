package com.example.android.appmosphere;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class NatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        //Creating ArrayList to contain our playlist
        ArrayList<Song> songs = new ArrayList<Song>();
        //These below are all existing audio files under the listed author name at environment.ambient-mixer.com
        songs.add(new Song("\"raresound\":", "Summer forest"));
        songs.add(new Song("\"Stork\":", "Light thunderstorm"));
        songs.add(new Song("\"raresound\":", "Evening bonfire"));
        songs.add(new Song("\"Alchemy\":", "At night in the wild"));
        songs.add(new Song("\"poetal\":", "Songbirds & windchimes"));
        songs.add(new Song("\"samasmith89\":", "Island jungle"));
        songs.add(new Song("\"Tara\":", "Loon lake"));
        songs.add(new Song("\"wpgreg\":", "Northern winter outdoors"));

        // creating & setting custom arraylist adapter on playlist that'll list all songs within the category
        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.playlist);
        listView.setAdapter(adapter);

        /* setting category-specific background image
        Source: "blue-blur-bubbles-close-up" by revac film's&photography at www.pexels.com
         */
        listView.setBackground(ContextCompat.getDrawable(this, R.drawable.rain));

        // Hooking up the return button
        ImageButton returnButton = (ImageButton) findViewById(R.id.button_return);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnToMainActivity = new Intent(NatureActivity.this, MainActivity.class);
                startActivity(returnToMainActivity);
            }
        });
    }
}


