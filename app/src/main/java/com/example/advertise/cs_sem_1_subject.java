package com.example.advertise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cs_sem_1_subject extends AppCompatActivity {

    Button button;
    Button button_1;
    Button button_2;
    Button button_3;

    String sem;
    String course;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_sem_1_subject);


        Intent intent_1 = getIntent();
       course=intent_1.getStringExtra("course");
        sem=intent_1.getStringExtra("sem");

        //***************************************************************************************************************************

      //*****************************************************************************************************************************




        button=findViewById(R.id.m1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cs_sem_1_subject.this,Question_paper_webview.class);
                intent.putExtra("KEY","1YEb273dcM6eDiobviz6iPUBRrOVKb60o");
                startActivity(intent);
                finish();
            }
        });









        button_1 = findViewById(R.id.physics);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cs_sem_1_subject.this,Question_paper_webview.class);
                intent.putExtra("KEY","11s0WJKP5bdA9gyo03EbRkRV70mrQFrGi");
                startActivity(intent);
                finish();
            }
        });

        button_2 = findViewById(R.id.electrical);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cs_sem_1_subject.this,Question_paper_webview.class);

                intent.putExtra("KEY","1P_mAa5J67nbeBZXP-uFA-w0gmNk20Dpf");
                startActivity(intent);
                finish();
            }
        });




        button_3 = findViewById(R.id.civil);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cs_sem_1_subject.this,Question_paper_webview.class);
                intent.putExtra("KEY","1KsKd4vdCIHCPzXy3_KQoIqXw2P3Kjtge");
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {

        int a=5;
        if(a==3){
        }
        else{
            super.onBackPressed();
        }

        /*
        Intent intent = new Intent(cs_sem_1_subject.this,Question_which_Branch.class);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        startActivity(intent);

         */


    }







}

