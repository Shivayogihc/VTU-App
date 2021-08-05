package com.example.advertise;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;
    DrawerLayout drawer;
    private AdView mAdView;
    String key_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        ImageButton imageButton = findViewById(R.id.notification);

        final String key_1 = "https://vtu.ac.in/en/category/exam-circulars-notifications/";
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCustomTab(key_1);
            }
        });






        //*****************************************
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //*********************************************





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
                Intent intent = new Intent(MainActivity_2.this,Previous_sem.class);
                overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
                startActivity(intent);
                finish();
            }
        });

        Button button_2 = findViewById(R.id.button_3);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_2.this,Other_college.class);
                overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
                startActivity(intent);
                finish();
            }
        });




        Button button_3 = findViewById(R.id.button_4);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_2.this,Question_which_Branch.class);
                overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
                startActivity(intent);
                finish();
            }
        });


        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1));
        }




        /*


        ImageView imageView = findViewById(R.id.imageView_user);
        TextView username = findViewById(R.id.user_name);
        TextView useremail = findViewById(R.id.user_email);


        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(MainActivity_2.this);



            String personName = acct.getDisplayName();
            String personEmail = acct.getEmail();

            username.setText("Name:" + personName);
            useremail.setText("Email :" + personEmail);

            Uri personPhoto = acct.getPhotoUrl();

            Glide.with(this).load(personPhoto).into(imageView);
            
         */












        ImageButton fab = findViewById(R.id.menu_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {
                drawer = findViewById(R.id.drawer_layout);

                //***************************
                if(!drawer.isDrawerOpen(Gravity.START))drawer.openDrawer(Gravity.START);
                else drawer.closeDrawer(Gravity.END);

                //*****************************
            }
        });



        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);




        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        /*
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

         */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_2, menu);
        return true;
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


    public void linkdin(){
        Intent intent = new Intent(MainActivity_2.this,Linkedin.class);
        startActivity(intent);
        finish();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.nav_home:


                break;
            case R.id.nav_gallery:

                break;

            case R.id.nav_slideshow:
                Intent intent= new Intent(this,Linkedin.class);
                String key = "https://www.linkedin.com";
                intent.putExtra("link",key);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_tools:
                openCustomTab(key_1);
                break;

        }


        return true;
    }
}
