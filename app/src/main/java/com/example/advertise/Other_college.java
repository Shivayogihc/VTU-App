package com.example.advertise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class Other_college extends AppCompatActivity {


    SearchView mySearchView;
    ListView myList;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    AdapterView adapterView;
    RadioGroup radioGroup;
    RadioButton radioButton;


    SearchView searchView;

    TextView textView;

    SearchView mySearchView_1;
    ListView myList_1;

    ArrayList<String> list_1;

    String key;
    ArrayAdapter<String> adapter_1;

    Spinner spinner_x;
    ArrayList<String> list_x;
    ArrayAdapter<String> adapter_x;

    ArrayList<String> list_2;
    ArrayAdapter<String> adapter_2;
    Spinner spinner;
    Spinner spinner_1;
    String sem;

    String j;

    String h;

    String m;
    String code;
    String year;

    String course;

    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_college);



        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1));
        }

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        /*
        radioGroup = findViewById(R.id.radiogroup);

        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        String b= (String) radioButton.getText();

         */


        //**************************************************************************************************************************************************************


        //mySearchView = findViewById(R.id.sem_spinner);


        /*
        myList = findViewById(R.id.myList);


         list = new ArrayList<String>();

        list.add("ACHARAYA INSTITUTE OF TECHNOLOGY");
        list.add("A.P.S COLLEGE OF ENGINEERING");
        list.add("ALPHA COLLEGE OF ENGINEERING");
        list.add("AMC ENGINEERING COLLEGE");
        list.add("AMRUTHA INSTITUTE OF ENGINEERING AND MGMT. SCIENCES");
        list.add("ATRIA INSTITUTE OF TECHNOLOGY");
        list.add("B.N.M.INSTITUTE OF TECHNOLOGY");
        list.add("B.T.L.INSTITUTE OF TECHNOLOGY");
        list.add("BANGALORE COLLEGE OF ENGINEERING AND TECHNOLOGY");
        list.add("BMS COLLEGE OF ENGINEERING");
        list.add("BMS EVENING COLLEGE OF ENGINEERING");
        list.add("BMS INSTITUTE OF TECHNOLOGY");
        list.add("BRINDAVAN COLLEGE OF ENGG");
        list.add("CAMBRIDGE INSTITUTE OF TECHNOLOGY");
        list.add("CHANNA BASAVESHWARA INSTITUTE OF TECHNOLOGY");
        list.add("CITY ENGINEERING COLLEGE");


        list.add("DAYANANDA SAGAR COLLEGE OF ENGINEERING");
        list.add("DON BOSCO INSTITUTE OF TECHNOLOGY");
        list.add("DR. T THIMAIAH INSTITUTE OF TECHNOLOGY");
        list.add("DR. AMBEDKAR INSTITUTE OF TECHNOLOGY");
        list.add("EAST POINT COLLEGE OF ENGINEERING AND TECHNOLOGY");



        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        myList.setAdapter(adapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String o = (String) myList.getItemAtPosition(position);
                mySearchView.setQuery(o,false);
                myList.setVisibility(View.INVISIBLE);
                mySearchView.clearFocus();
            }
        });



        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {

                myList.setVisibility(View.VISIBLE);
                mySearchView.setQuery(s,false);
                mySearchView.clearFocus();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                myList.setVisibility(View.VISIBLE);
                adapter.getFilter().filter(s);
                return false;
            }
        });

         */





        //**************************************************************************************************************************************************************

        /*

        mySearchView_1 = findViewById(R.id.course);

        myList_1 = findViewById(R.id.course_list);


        list_1 = new ArrayList<String>();

        list_1.add("CS");
        list_1.add("IS");
        list_1.add("EC");
        list_1.add("MC");
        list_1.add("CV");



        adapter_1 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list_1);
        myList_1.setAdapter(adapter_1);

        myList_1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String o = (String) myList_1.getItemAtPosition(position);
                mySearchView_1.setQuery(o,false);
                myList_1.setVisibility(View.INVISIBLE);
                mySearchView_1.clearFocus();
            }
        });



        mySearchView_1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {

                myList_1.setVisibility(View.VISIBLE);
                mySearchView_1.setQuery(s,false);
                mySearchView_1.clearFocus();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                myList_1.setVisibility(View.VISIBLE);
                adapter_1.getFilter().filter(s);
                return false;
            }
        });

         */


        //**************************************************************************************************************************************************************



        spinner_x =  findViewById(R.id.sem_spinner);


        list_x = new ArrayList<String>();


        list_x.add("1st semester");
        list_x.add("2nd semester");
        list_x.add("3rd semester");
        list_x.add("4th semester");
        list_x.add("5th semester");
        list_x.add("6th semester");
        list_x.add("7th semester");
        list_x.add("8th semester");




        adapter_x = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list_x);
        adapter_x.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinner_x.setAdapter(adapter_x);
        spinner_x.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                String man=spinner_x.getSelectedItem().toString();
                if(man=="1st semester"){
                    sem="1";    //back_1

                }else  if(man=="2nd semester"){
                    sem="2";      //fr

                }else if(man=="3rd semester"){
                    sem="3";

                }else  if(man=="4th semester"){
                    sem="4";

                }else if(man=="5th semester"){

                    sem="5";

                }else if(man=="6th semester"){

                    sem="6";

                }else if(man=="7th semester"){

                    sem="7";

                }else if(man=="8th semester"){

                    sem="8";

                }


               /*
               Toast.makeText(Other_college.this,spinner.getSelectedItem().toString(),Toast.LENGTH_LONG).show();
               switch (position){
                   case 0:

                   break;
                   case  back_1:

                       break;

               }

                */
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //***********************************************************************************************************************
        spinner =  findViewById(R.id.spinner);


        list_2 = new ArrayList<String>();


        list_2.add("2019");
        list_2.add("2018");
        list_2.add("2017");
        list_2.add("2016");
        list_2.add("2015");




        adapter_2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list_2);
        adapter_2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinner.setAdapter(adapter_2);
       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


               h=spinner.getSelectedItem().toString();
               if(h=="2019"){
                   year="19";

               }else  if(h=="2018"){
                   year="18";

               }else if(h=="2017"){
                   year="17";

               }else  if(h=="2016"){
                   year="16";

               }else if(h=="2015"){

                   year="15";

               }


               /*
               Toast.makeText(Other_college.this,spinner.getSelectedItem().toString(),Toast.LENGTH_LONG).show();
               switch (position){
                   case 0:

                   break;
                   case  back_1:

                       break;

               }

                */
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });


       //*******************************************************************************************
        spinner_1 =  findViewById(R.id.course_spinner);

        list_1 = new ArrayList<String>();

        list_1.add("Computer Science");
        list_1.add("Information Science");
        list_1.add("Electrical");
        list_1.add("Mechanical");
        list_1.add("Civil");



        adapter_1 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list_1);
        adapter_1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinner_1.setAdapter(adapter_1);
        spinner_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                m=spinner_1.getSelectedItem().toString();
                if(m=="Computer Science"){
                    course="cs";

                }else  if(m=="Information Science"){
                   course="is";

                }else if(m=="Electrical"){
                    course="ec";

                }else  if(m=="Mechanical"){
                    course="me";

                }else if(m=="Civil"){

                    course="cv";

                }



               // Toast.makeText(Other_college.this,spinner_1.getSelectedItem().toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        textView= findViewById(R.id.edit);

        Intent intent = getIntent();
        String name=intent.getStringExtra("college_name");
        j= intent.getStringExtra("elon");

        textView.setText(name);

    }

    public void lol(View view){

        Intent intent = new Intent(Other_college.this,Search_college.class);
        overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
        startActivity(intent);

        finish();
    }

    public void elon(View view){
        overridePendingTransition(R.anim.fade_out,R.anim.fade_in);


        key = null;





        Intent intent = new Intent(Other_college.this,Webview_other.class);
        overridePendingTransition(0,0);
        if(year =="18"){
            if(sem =="1"){
                key="/1/19?";
            }else if(sem == "2"){
                key ="/2/22?";

            }else if(sem =="3"){
                key = "/3/26?";
            }
        }
        else if(year =="17"){
            if(sem =="1"){
                key="/1/19?";
            }else if(sem == "2"){
                key ="/2/15?";

            }else if(sem =="3"){
                key = "/3/19?";
            }else if(sem == "4"){
                key ="/4/22?";

            }else if(sem =="5"){
                key = "/5/26?";
            }

        }else if(year =="16"){
            if(sem =="1"){
                key="/1/22?";
            }else if(sem == "2"){
                key ="/2/22?";

            }else if(sem =="3"){
                key = "/3/9?";
            }else if(sem == "4"){
                key ="/4/15?";

            }else if(sem =="5"){
                key = "/5/19?";
            }else if(sem =="6"){
                key = "/6/22?";
            }else if(sem =="7"){
                key = "/7/26?";
            }

        }else if(year =="15"){

            //**********************(ROUGH CACL
            if(sem =="1"){
                key="/1/22?";
            }else if(sem == "2"){
                key ="/2/22?";

            }else if(sem =="3"){
                key = "/3/9?";
            }else if(sem == "4"){
                key ="/4/15?";

            }       //*********************(ROUGH ***
            else if(sem =="5"){
                key = "/5/9?";
            }else if(sem =="6"){
                key = "/6/15?";
            }else if(sem =="7"){
                key = "/7/22?";
            }else if(sem =="8"){
                key = "/8/22?";
            }

        }

        intent.putExtra("code",j);
        intent.putExtra("year",year);
        intent.putExtra("course",course);
        intent.putExtra("key",key);

        startActivity(intent);

        finish();
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

        Intent intent = new Intent(Other_college.this, MainActivity_1.class);
        overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
        startActivity(intent);



    }
}
