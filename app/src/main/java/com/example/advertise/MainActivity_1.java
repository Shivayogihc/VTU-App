package com.example.advertise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity_1 extends AppCompatActivity {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        FloatingActionButton lol = findViewById(R.id.user_account);

        lol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_1.this,User_account.class);
                overridePendingTransition(0,0);
                startActivity(intent);
                finish();
            }
        });



        Button openLinkbutton = findViewById(R.id.button_1);

        final String url = "https://results.vtu.ac.in/_CBCS/index.php";

        //https://results.vtu.ac.in/_CBSC/index.php
        openLinkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openCustomTab(url);
            }
        });


        /*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_1.this,This_sem.class);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                startActivity(intent);
                finish();
            }
        });

         */





        Button button_1 = findViewById(R.id.button_2);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_1.this,Previous_sem.class);
                overridePendingTransition(0,0);
                startActivity(intent);
                finish();
            }
        });

        Button button_2 = findViewById(R.id.button_3);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_1.this,Other_college.class);
                overridePendingTransition(0,0);
                startActivity(intent);
                finish();
            }
        });




        Button button_3 = findViewById(R.id.button_4);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_1.this,Question_which_Branch.class);
                overridePendingTransition(0,0);
                startActivity(intent);
                finish();
            }
        });


        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1));
        }

    }

    private void openCustomTab(String url) {
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(ContextCompat.getColor(this,R.color.colorPrimary_3));
        builder.addDefaultShareMenuItem();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));


    }

    @Override
    public void onBackPressed() {
        super.finish();
       // super.onBackPressed();
    }
}


