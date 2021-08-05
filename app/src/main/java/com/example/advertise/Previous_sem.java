package com.example.advertise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Previous_sem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_sem);


        Button button = findViewById(R.id.proceed);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.edittext);

                final String message = editText.getText().toString();
                Intent intent = new Intent(Previous_sem.this,pre_web.class);
                overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
                intent.putExtra("lol",message);
                startActivity(intent);

            }
        });

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1));
        }

    }


    @Override
    public void onBackPressed() {
        /*
        int a=5;
        if(a==3){
        }
        else{
            super.onBackPressed();
        }

         */

        Intent intent = new Intent(Previous_sem.this, MainActivity_1.class);
        overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
        startActivity(intent);



    }

}
