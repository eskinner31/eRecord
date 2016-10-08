package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SongsActivity extends AppCompatActivity {

    ListView songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        songs = (ListView) findViewById(R.id.songs_list);
        songs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent nowPlayingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                    startActivity(nowPlayingIntent);
                }
            }
        });
    }

}
