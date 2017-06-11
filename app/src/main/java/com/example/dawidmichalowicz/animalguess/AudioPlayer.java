package com.example.dawidmichalowicz.animalguess;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by Dawid Michałowicz on 11.06.2017.
 */

public class AudioPlayer {

    private MediaPlayer mediaPlayer;

    public void stop() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    public void play(Context c, int res) {
        stop();

        mediaPlayer = MediaPlayer.create(c, res);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mediaPlayer){
                stop();
            }
        });

        mediaPlayer.start();
    }
}
