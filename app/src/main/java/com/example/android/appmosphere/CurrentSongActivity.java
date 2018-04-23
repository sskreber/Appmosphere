package com.example.android.appmosphere;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CurrentSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_song);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String currentSong = extras.getString("currentSong");
            String currentAuthor = extras.getString("currentAuthor");
            TextView currentSongView = findViewById(R.id.current_song);
            currentSongView.setText(currentSong);
            TextView currentAuthorView = findViewById(R.id.current_author);
            currentAuthorView.setText(currentAuthor);
        }

        // Hooking up the return button to get user back to sending activity (song category) from current song
        ImageButton returnButton = (ImageButton) findViewById(R.id.button_return_to_category);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        /* Similarly, there would be code here to play music, but since the app is not required to play music, this comment
        block here is just to point out that an OnClickListener would have to be set on the play and the stop buttons
        (id's: button_play, button_stop), respectively, for the app to play and stop playing music.
        */

        // Hooking up the return to menu button to get user back to main activity from currently played song
        Button returnToMenuButton = (Button) findViewById(R.id.button_return_to_menu);
        returnToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnToMainActivity = new Intent(CurrentSongActivity.this, MainActivity.class);
                startActivity(returnToMainActivity);
            }
        });
    }
}


