package com.example.advertise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class User_account extends AppCompatActivity {


    GoogleSignInClient mGoogleSignInClient;
    Button sign_out;
    TextView nameIv;
    TextView emailIv;
    TextView idIv;
    ImageView photoIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_account);


        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1));
        }

        sign_out = findViewById(R.id.log_out);
        nameIv = findViewById(R.id.name);
        emailIv = findViewById(R.id.email);
        idIv = findViewById(R.id.id);
        photoIv = findViewById(R.id.photo);


        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();

        mGoogleSignInClient = GoogleSignIn.getClient(this,gso);


        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(User_account.this);

        if(acct != null){

            String personName = acct.getDisplayName();
            String personEmail = acct.getEmail();
            String  personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();

            nameIv.setText("Name:"+personName);
            emailIv.setText("Email :"+personEmail);
            idIv.setText("Id :"+personId);


            Glide.with(this).load(personPhoto).into(photoIv);

        }

        sign_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signOut();
            }
        });

    }

    private void signOut() {
        mGoogleSignInClient.signOut().addOnCompleteListener(this, new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                Toast.makeText(User_account.this,"Succesfully signed out",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(User_account.this,Login_Activity.class));
                finish();
            }
        });
    }
}
