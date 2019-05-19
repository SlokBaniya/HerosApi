package com.herosapi;

import android.graphics.BitmapFactory;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import url.Url;

public class LoadImgStrictModeActivity extends AppCompatActivity {
    private ImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_img_strict_mode);

        imgProfile = findViewById(R.id.imgPhoto);
        loadFromURL();
    }

    private void StrictMode(){
        android.os.StrictMode.ThreadPolicy policy = new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build();
        android.os.StrictMode.setThreadPolicy(policy);
    }
    private void loadFromURL(){
        StrictMode();
        try {
            String imgURL = "http://www.jakpost.travel/imgfiles/full/107/1070407/thor-phone-wallpaper.jpg";
            URL url = new URL(imgURL);
            imgProfile.setImageBitmap(BitmapFactory.decodeStream((InputStream)url.getContent()));

        } catch (IOException e){
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }
    }

}
