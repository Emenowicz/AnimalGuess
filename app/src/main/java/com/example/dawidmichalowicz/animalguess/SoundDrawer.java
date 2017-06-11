package com.example.dawidmichalowicz.animalguess;

import android.content.Context;
import android.content.res.Resources;

import java.io.File;
import java.util.TreeMap;

/**
 * Created by Dawid Michałowicz on 11.06.2017.
 */

public class SoundDrawer {
    private int random=-1;
    private String[] name = {"cat","chicken","cow","dog","duck","elephant","fish","horse","lion"};
    private Context context;

    public SoundDrawer(Context context){
        this.context = context;
    }

    public int getRandomSoundId(){
        random = (int)(Math.random()*8);
        return context.getResources().getIdentifier(name[random],"raw",context.getPackageName());
    }

    public String getCorrectAnswer(){
        if(random != -1){
            return name[random];
        }
        else {
            return name[0];
        }
    }

    public int getLastSoundId(){
        return context.getResources().getIdentifier(name[random],"raw",context.getPackageName());
    }

    private String getResPath(int index){
        return "/res/raw/" + name[index] + ".wav";
    }

}
