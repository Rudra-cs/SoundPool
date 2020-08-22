package com.rudra.soundpool;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class DjGuns extends AppCompatActivity implements View.OnClickListener {

    SoundPool sp;
    private int music1;
    private int music2;
    private int music3;
    private int music4;
    private int music5;
    private int music6;
    private int music7;
    private int music8;
    private int music9;
    private int music00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dj_guns);
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        music1 = sp.load(getApplicationContext(),R.raw.akm,1);
        music2 = sp.load(getApplicationContext(),R.raw.awm,1);
        music3 = sp.load(getApplicationContext(),R.raw.scarl,1);
        music4 = sp.load(getApplicationContext(),R.raw.kar98k,1);
        music5 = sp.load(getApplicationContext(),R.raw.uzi,1);
        music6 = sp.load(getApplicationContext(),R.raw.s12k,1);
        music7 = sp.load(getApplicationContext(),R.raw.flare_gun,1);
        music8 = sp.load(getApplicationContext(),R.raw.m249,1);
        music9 = sp.load(getApplicationContext(),R.raw.mini_14,1);
        music00 = sp.load(getApplicationContext(),R.raw.sound00,1);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.akm:
                sp.play(music1,1.0f,1.0f,0,0,1.0f);
                break;
            case R.id.awm:
                sp.play(music2,1.0f,1.0f,1,0,1.0f);
                break;
            case R.id.scarl:
                sp.play(music3,1.0f,1.0f,0,0,1.0f);
                break;
            case R.id.kar98k:
                sp.play(music4,1.0f,1.0f,1,0,1.0f);
                break;
            case R.id.uzi:
                sp.play(music5,1.0f,1.0f,0,0,1.0f);
                break;
            case R.id.s12k:
                sp.play(music6,1.0f,1.0f,1,0,1.0f);
                break;
            case R.id.flare:
                sp.play(music7,1.0f,1.0f,0,0,1.0f);
                break;
            case R.id.m249:
                sp.play(music8,1.0f,1.0f,1,0,1.0f);
                break;
            case R.id.mini14:
                sp.play(music9,1.0f,1.0f,0,0,1.0f);
                break;
            default:
                break;
        }

    }


//    public void playsound1(View view){
//        sp.play(music1,1.0f,1.0f,0,0,1.0f);
//    }
//    public void playsound2(View view){
//        sp.play(music2,1.0f,1.0f,0,0,1.0f);
//    }
//    public void playsound3(View view){
//        sp.play(music3,1.0f,1.0f,0,0,1.0f);
//    }
//    public void playsound4(View view){
//        sp.play(music4,1.0f,1.0f,0,0,1.0f);
//    }
//    public void playsound5(View view){
//        sp.play(music5,1.0f,1.0f,0,0,1.0f);
//    }
//    public void playsound6(View view){
//        sp.play(music6,1.0f,1.0f,0,0,1.0f);
//    }
//    public void playsound7(View view){
//        sp.play(music7,1.0f,1.0f,0,0,1.0f);
//    }
//    public void playsound8(View view){
//        sp.play(music8,1.0f,1.0f,0,0,1.0f);
//    }
//    public void playsound9(View view){
//        sp.play(music9,1.0f,1.0f,0,0,1.0f);
//    }
}
