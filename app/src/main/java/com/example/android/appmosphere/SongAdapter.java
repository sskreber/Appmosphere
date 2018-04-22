package com.example.android.appmosphere;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Context context, ArrayList<Song> pSongs) {
        super(context, 0, pSongs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }
        final Song current_song = getItem(position);
        TextView authorNameTextView = (TextView) listItemView.findViewById(R.id.authorName_text_view);
        authorNameTextView.setText(current_song.getAuthorName());
        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.songTitle_text_view);
        songTitleTextView.setText(current_song.getSongTitle());

        /* Setting OnClickListener working on any item of the listview to get to a currently played song activity
        after clicking on any song
         */
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent currentSongIntent = new Intent(getContext(), CurrentSongActivity.class);
                currentSongIntent.putExtra("currentSong", current_song.getSongTitle());
                currentSongIntent.putExtra("currentAuthor", current_song.getAuthorName());
                getContext().startActivity(currentSongIntent);
            }
        });
        return listItemView;
    }
}