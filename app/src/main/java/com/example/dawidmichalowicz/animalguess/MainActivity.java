package com.example.dawidmichalowicz.animalguess;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindInt;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    AudioPlayer player;
    SoundDrawer soundDrawer;
    String answer;
    boolean answered = true;
    @BindView(R.id.answerimageView)
    ImageView imageView;
    int correct, wrong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        player = new AudioPlayer();
        soundDrawer = new SoundDrawer(this);
        correct = getResources().getIdentifier("correct", "raw", getPackageName());
        wrong = getResources().getIdentifier("wrong", "raw", getPackageName());


    }

    @OnClick(R.id.playButton)
    public void playSound() {
        if (answered) {
            player.play(this, soundDrawer.getRandomSoundId());
            answer = soundDrawer.getCorrectAnswer();
            answered = false;
        } else {
            player.play(this, soundDrawer.getLastSoundId());
        }
        imageView.setImageDrawable(getDrawable(R.drawable.question));
    }

    @OnClick(R.id.chickenButton)
    public void isChicken() {
        if (!answered) {
            if (answer.equals("chicken")) {
                imageView.setImageDrawable(getDrawable(R.drawable.correct));
                player.play(this, correct);
                answered = true;
            } else {
                imageView.setImageDrawable(getDrawable(R.drawable.wrong));
                player.play(this, wrong);
            }
        }
    }

    @OnClick(R.id.catButton)
    public void isCat() {
        if (!answered) {
            if (answer.equals("cat")) {
                imageView.setImageDrawable(getDrawable(R.drawable.correct));
                player.play(this, correct);
                answered = true;
            } else {
                imageView.setImageDrawable(getDrawable(R.drawable.wrong));
                player.play(this, wrong);
            }
        }
    }

    @OnClick(R.id.cowButton)
    public void isCow() {
        if (!answered) {
            if (answer.equals("cow")) {
                imageView.setImageDrawable(getDrawable(R.drawable.correct));
                player.play(this, correct);
                answered = true;
            } else {
                imageView.setImageDrawable(getDrawable(R.drawable.wrong));
                player.play(this, wrong);
            }
        }
    }

    @OnClick(R.id.dogButton)
    public void isDog() {
        if (!answered) {
            if (answer.equals("dog")) {
                imageView.setImageDrawable(getDrawable(R.drawable.correct));
                player.play(this, correct);
                answered = true;
            } else {
                imageView.setImageDrawable(getDrawable(R.drawable.wrong));
                player.play(this, wrong);
            }
        }
    }

    @OnClick(R.id.duckButton)
    public void isDuck() {
        if (!answered) {
            if (answer.equals("duck")) {
                imageView.setImageDrawable(getDrawable(R.drawable.correct));
                player.play(this, correct);
                answered = true;
            } else {
                imageView.setImageDrawable(getDrawable(R.drawable.wrong));
                player.play(this, wrong);
            }
        }
    }

    @OnClick(R.id.elephantButton)
    public void isElephant() {
        if (!answered) {
            if (answer.equals("elephant")) {
                imageView.setImageDrawable(getDrawable(R.drawable.correct));
                player.play(this, correct);
                answered = true;
            } else {
                imageView.setImageDrawable(getDrawable(R.drawable.wrong));
                player.play(this, wrong);
            }
        }
    }

    @OnClick(R.id.fishButton)
    public void isFish() {
        if (!answered) {
            if (answer.equals("fish")) {
                imageView.setImageDrawable(getDrawable(R.drawable.correct));
                player.play(this, correct);
                answered = true;
            } else {
                imageView.setImageDrawable(getDrawable(R.drawable.wrong));
                player.play(this, wrong);
            }
        }
    }

    @OnClick(R.id.horseButton)
    public void isHorse() {
        if (!answered) {
            if (answer.equals("horse")) {
                imageView.setImageDrawable(getDrawable(R.drawable.correct));
                player.play(this, correct);
                answered = true;
            } else {
                imageView.setImageDrawable(getDrawable(R.drawable.wrong));
                player.play(this, wrong);
            }
        }
    }

    @OnClick(R.id.lionButton)
    public void isLion() {
        if (!answered) {
            if (answer.equals("lion")) {
                imageView.setImageDrawable(getDrawable(R.drawable.correct));
                player.play(this, correct);
                answered = true;
            } else {
                imageView.setImageDrawable(getDrawable(R.drawable.wrong));
                player.play(this, wrong);
            }
        }
    }
}
