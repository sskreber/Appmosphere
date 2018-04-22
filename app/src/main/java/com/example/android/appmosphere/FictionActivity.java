package com.example.android.appmosphere;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class FictionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        //Creating ArrayList to contain our playlist
        ArrayList<Song> songs = new ArrayList<Song>();
        //These below are all existing audio files under the listed author name at environment.ambient-mixer.com
        songs.add(new Song("\"QuoteRaven\":", "Slytherin common room"));
        songs.add(new Song("\"blaisezabini\":", "Hogwarts library"));
        songs.add(new Song("\"jadeice\":", "Riding with the Winchesters"));
        songs.add(new Song("\"Kyrianne365\":", "In Rivendell"));
        songs.add(new Song("\"swingsetsarecool\":", "Sherlock's apartment"));
        songs.add(new Song("\"Carpe Noctem\":", "Loki's chambers"));
        songs.add(new Song("\"Digitaldreams11\":", "Jedi temple"));
        songs.add(new Song("\"Chouli Patches\":", "Tom Bombadil's house"));

        // creating & setting custom arraylist adapter on playlist that'll list all songs within the category
        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.playlist);
        listView.setAdapter(adapter);

        /* setting category-specific background image
        Source: "Wizarding World of Harry Potter Universal Studios Orlando" by @sprocket410 at www.pexels.com
         */
        listView.setBackground(ContextCompat.getDrawable(this, R.drawable.hogwarts));

        /* Hooking up the return button */
        ImageButton returnButton = (ImageButton) findViewById(R.id.button_return);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnToMainActivity = new Intent(FictionActivity.this, MainActivity.class);
                startActivity(returnToMainActivity);
            }
        });
    }
}
