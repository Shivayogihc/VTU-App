package com.example.advertise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class All_result extends AppCompatActivity {
    Intent intent;
    String url_1;
    String url_2;
    String url_3;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;
    String m1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_result);


        Button button1= findViewById(R.id.button1);
        Button button2= findViewById(R.id.button2);
        Button button3= findViewById(R.id.button3);


        intent= getIntent();




        final TextView textView1= findViewById(R.id.sub_1);
        TextView textView2 = findViewById(R.id.sub_2);
        TextView textView3 = findViewById(R.id.sub_3);

        String sub_1=intent.getStringExtra("txt_1");
        String sub_2=intent.getStringExtra("txt_2");
        String sub_3=intent.getStringExtra("txt_3");


        textView1.setText(sub_1);
        textView2.setText(sub_2);
        textView3.setText(sub_3);



        url_1=intent.getStringExtra("sub1");
        url_2=intent.getStringExtra("sub2");
        url_3=intent.getStringExtra("sub3");




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1= new Intent(All_result.this,Question_paper_webview.class);


                //*************************************************************

                intent1.putExtra("sub",url_1);
                startActivity(intent1);
                finish();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1= new Intent(All_result.this,Question_paper_webview.class);
                intent1.putExtra("sub",url_2);
                startActivity(intent1);
                finish();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1= new Intent(All_result.this,Question_paper_webview.class);
                intent1.putExtra("sub",url_3);
                startActivity(intent1);
                finish();

            }
        });



    }
}
