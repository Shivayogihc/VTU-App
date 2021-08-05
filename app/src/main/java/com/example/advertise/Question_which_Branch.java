package com.example.advertise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Question_which_Branch extends AppCompatActivity {


    SearchView mySearchView;
    ListView myList;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    AdapterView adapterView;
    RadioGroup radioGroup;
    RadioButton radioButton;
    String sub1;
    String sub2;

    Intent intent;
    String m1;
    String physics;

    DatabaseReference uniqueKey;

    String electrical;

    SearchView searchView;

    SearchView mySearchView_1;
    ListView myList_1;

    ArrayList<String> list_1;
    ArrayAdapter<String> adapter_1;

    ArrayList<String> list_2;
    ArrayAdapter<String> adapter_2;
    Spinner spinner;
    Spinner spinner_1;




    ArrayAdapter adapter_3;
    Spinner spinner_2;
    ArrayList<String> list_3;
    String j;

    String h;

    String m;
    String code;
    String sem;

    String course;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference  reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_which__branch);

        firebaseDatabase = FirebaseDatabase.getInstance();
        reference = firebaseDatabase.getReference().child("cs");

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1));
        }




        spinner_1 =  findViewById(R.id.branch_spinner);

        list_1 = new ArrayList<String>();

        list_1.add("Computer Science");
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


        //*********************************************************************************************************************************






        /*
        spinner_2 =  findViewById(R.id.subject_spinner);





        adapter_3 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list_1);
        adapter_3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

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

         */






        //*********************************************************************

        spinner =  findViewById(R.id.sem_spinner);


        list_2 = new ArrayList<String>();



        list_2.add("1st Sem(P Cycle)");
        list_2.add("2nd Sem(C Cycle)");
        list_2.add("3rd Sem");
        list_2.add("4th Sem");
        list_2.add("5th Sem");
        list_2.add("6th Sem");
        list_2.add("7th Sem");
        list_2.add("8th Sem");
        list_2.add("Nanage Adu Gothilla");



        adapter_2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list_2);
        adapter_2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinner.setAdapter(adapter_2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                h=spinner.getSelectedItem().toString();


                if(h=="1st Sem(P Cycle)"){
                   sem ="1";
                }else  if (h=="2nd Sem(C Cycle)"){
                    sem="2";
                }else if(h=="3rd Sem"){
                    sem="3";

                }else  if(h=="4th Sem"){
                    sem="4";

                }else if(h=="5th Sem"){

                    sem="5";

                }else  if(h=="6th Sem"){

                    sem="6";
                }else  if(h=="7th Sem"){

                    sem="7";

                }else if(h=="8th Sem"){

                    sem="8";

                }else  if(h=="Nanage Adu Gothilla"){

                    Toast.makeText(Question_which_Branch.this,"Juice Kudithiya",Toast.LENGTH_LONG).show();
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









    }

    public void elon_2(View view){




       // reference = firebaseDatabase.getReference().child("question_paper").child("cs").child("1sem");
        if(course=="cs") {
              if (sem == "1") {

                  intent = new Intent(Question_which_Branch.this, All_result.class);

                  String sub_1="Mathematics";
                  String sub_2="Physics";
                  String sub_3="electrical";

                  intent.putExtra("txt_1",sub_1);
                  intent.putExtra("txt_2",sub_2);
                  intent.putExtra("txt_3",sub_3);



                  String ele="1P_mAa5J67nbeBZXP-uFA-w0gmNk20Dpf";
                  String m1="1YEb273dcM6eDiobviz6iPUBRrOVKb60o";
                  String physics="11s0WJKP5bdA9gyo03EbRkRV70mrQFrGi";

                  intent.putExtra("sub1",ele);
                  intent.putExtra("sub2",m1);
                  intent.putExtra("sub3",physics);
                  startActivity(intent);
                  finish();







                  // reference = firebaseDatabase.getReference().child("cs");
                  /*
                  reference.addValueEventListener(new ValueEventListener() {
                      @Override
                      public void onDataChange(DataSnapshot dataSnapshot) {
                          for(DataSnapshot snapshot : dataSnapshot.getChildren()){
                              information info= snapshot.getValue(information.class);
                              String m1= info.getM1();
                              String physics = info.getPhysics();
                              String electrical= info.getElectrical();

                              intent.putExtra("m1",m1);
                              intent.putExtra("physics",physics);
                              intent.putExtra("electrical",electrical);


                          }

                   */




                          /*
                          m1= dataSnapshot.child("m1").getValue().toString();
                          physics= dataSnapshot.child("physics").getValue().toString();
                          electrical= dataSnapshot.child("electrical").getValue().toString();

                           */







                  //DataSnapshot dataSnapshot_1 = null;


                  /*
                  String m1= dataSnapshot_1.child("m1").getValue().toString();
                  String physics= dataSnapshot_1.child("physics").getValue().toString();
                  String electrical= dataSnapshot_1.child("electrical").getValue().toString();
                  intent.putExtra("m1",m1);
                  intent.putExtra("physics",physics);
                  intent.putExtra("electrical",electrical);

                   */




              }
              else if (sem == "2") {
                  intent = new Intent(Question_which_Branch.this, All_result.class);

                  String sub_1="Chemistry";
                  String sub_2="m2";
                  String sub_3="cs";

                  intent.putExtra("txt_1",sub_1);
                  intent.putExtra("txt_2",sub_2);
                  intent.putExtra("txt_3",sub_3);



                  String ele="1P_mAa5J67nbeBZXP-uFA-w0gmNk20Dpf";
                  String m1="1YEb273dcM6eDiobviz6iPUBRrOVKb60o";
                  String physics="11s0WJKP5bdA9gyo03EbRkRV70mrQFrGi";

                  intent.putExtra("sub1",ele);
                  intent.putExtra("sub2",m1);
                  intent.putExtra("sub3",physics);
                  startActivity(intent);
                  finish();
            }else if (sem == "3") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                //  intent.putExtra("sem_",sem);
                startActivity(intent);
                finish();
            }else if (sem == "4") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
               //   intent.putExtra("sem_4",sem);
                startActivity(intent);
                finish();
            }else if (sem == "5") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            } else if (sem == "6") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "7") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "8") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }
        }
        else  if(course=="ec") {
            if (sem == "back_1") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "fr") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "3") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "4") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "5") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            } else if (sem == "6") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "7") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "8") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }
        }
        else  if(course=="me") {
            if (sem == "back_1") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "fr") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "3") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "4") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "5") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            } else if (sem == "6") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "7") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "8") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }
        }
        else  if(course=="cv") {
            if (sem == "back_1") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "fr") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "3") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "4") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "5") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            } else if (sem == "6") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "7") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }else if (sem == "8") {
                Intent intent = new Intent(Question_which_Branch.this, cs_sem_1_subject_fragment.class);
                startActivity(intent);
                finish();
            }
        }






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
        Intent intent = new Intent(Question_which_Branch.this, MainActivity_1.class);
        startActivity(intent);

         */

    }
}
