package com.example.youtubeplayer;

import android.annotation.SuppressLint;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.zip.Inflater;

import static com.example.youtubeplayer.R.id.YoutubeInflater;

public class YoutubeActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
     public static  String keyId="AIzaSyB2x437dI54H2smYkedDa3cXplBmbaqr3w";
    public static  String video="s5xKxliBMTo";
    public static  String playList="PLAwxTw4SYaPnIRwl6rad_mYwEk4Gmj7Mx";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
     YouTubePlayerView youTubePlayerView=(YouTubePlayerView) findViewById(R.id.youtubePlayerView);
     youTubePlayerView.initialize(keyId,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
