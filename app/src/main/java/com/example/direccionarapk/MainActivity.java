package com.example.direccionarapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageButton btnGoogle, btnInsta, btnYou, btnFace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnGoogle = (ImageButton) findViewById(R.id.btnGoogle);
        btnInsta = (ImageButton) findViewById(R.id.btnInsta);
        btnYou = (ImageButton) findViewById(R.id.btnYou);
        btnFace = (ImageButton) findViewById(R.id.btnFace);

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri google = Uri.parse("http://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
            }
        });

        btnInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insta = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                startActivity(insta);
            }
        });

        btnYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent youtube = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity(youtube);
            }
        });

        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebook = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(facebook);
            }
        });
    }
}