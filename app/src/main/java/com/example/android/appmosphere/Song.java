package com.example.android.appmosphere;

public class Song {

    // Author of the song

    private String mAuthorName;

    // Title of the song

    private String mSongTitle;

    /*
     * Creates a new Song object.
     * @param authorName is the name of the user who compiled the atmosphere audio file (named song in most of the code documentation)
     * @param songTitle is the file name of the atmosphere audio file
     */

    public Song(String authorName, String songTitle) {
        mAuthorName = authorName;
        mSongTitle = songTitle;
    }

    // Getting the author name belonging to the song

    public String getAuthorName() {
        return mAuthorName;
    }

    // Getting the song title

    public String getSongTitle() {
        return mSongTitle;
    }
}













