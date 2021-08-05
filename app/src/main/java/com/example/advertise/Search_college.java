package com.example.advertise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SearchView;
import android.widget.Spinner;

import java.util.ArrayList;

public class Search_college extends AppCompatActivity {



    SearchView mySearchView;
    ListView myList;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    AdapterView adapterView;
    RadioGroup radioGroup;
    RadioButton radioButton;


    SearchView searchView;

    SearchView mySearchView_1;
    ListView myList_1;

    ArrayList<String> list_1;
    ArrayAdapter<String> adapter_1;

    ArrayList<String> list_2;
    ArrayAdapter<String> adapter_2;
    Spinner spinner;
    Spinner spinner_1;
    String code;

    String o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_college);


        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1));
        }

        mySearchView = findViewById(R.id.searchview);


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




        list.add("EAST WEST INSTITUTE OF TECHNOLOGY");
        list.add("GHOUSIA COLLEGE OF ENGINEERING");
        list.add("GLOBAL ACADEMY OF TECHNOLOGY");
        list.add("GOVERNMENT S.K.S.J.T. INSTITUTE OF TECHNOLOGY");
        list.add("GOVERNMENT SKSJT EVENING COLLEGE");
        list.add("GOVERNMENT TOOL ROOM AND TRAINING CENTRE");
        list.add("GOVT. ENGINEERING COLLEGE RAMNAGAR");
        list.add("HKBK COLLEGE OF ENGINEERING");
        list.add("HMS INSTITUTE OF TECHNOLOGY");
        list.add("IMPACT COLLEGE OF ENGINEERING");
        list.add("ISLAMIAH INSTITUTE OF TECHNOLOGY");
        list.add("JSS ACADEMY OF TECHNICIAL EDUCATION");
        list.add("K.S.INSTITUTE OF TECHNOLOGY");
        list.add("KALPATARU INSTITUTE OF TECHNOLOGY");
        list.add("KNS INSTITUTE OF TECHNOLOGY");
        list.add("M.S.ENGINEERING COLLEGE");
        list.add("M.S.RAMAIAH INSTITUTE OF TECHNIOLOGY");
        list.add("MVJ COLLEGE OF ENGINEERING");
        list.add("NAGARJUNA COLLEGE OF ENGINEERING AND TECHNOLOGY");
        list.add("NEW HORIZON COLLEGE OF ENGINEERING");
        list.add("NITTE MEENAKSHI INSTITUTE OF TECHNOLOGY");






        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        myList.setAdapter(adapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                o = (String) myList.getItemAtPosition(position);
                Intent intent = new Intent(Search_college.this,Other_college.class);
                startActivity(intent);
                finish();

                //********************************************************************



                Intent intent_1 = new Intent(Search_college.this,Other_college.class);


                if(o=="ACHARAYA INSTITUTE OF TECHNOLOGY"){
                    code="1AY";
                }else if(o=="A.P.S COLLEGE OF ENGINEERING"){

                    code="1AP";
                }else if(o=="ALPHA COLLEGE OF ENGINEERING"){

                    code="1AC";
                }else if(o=="AMC ENGINEERING COLLEGE"){

                    code="1AM";
                }else if(o=="AMRUTHA INSTITUTE OF ENGINEERING AND MGMT SCIENCES"){

                    code="1AR";
                }else if(o=="ATRIA INSTITUTE OF TECHNOLOGY"){

                    code="1AT";
                }else if(o=="B.N.M.INSTITUTE OF TECHNOLOGY"){

                    code="1BG";
                }else if(o=="B.T.L.INSTITUTE OF TECHNOLOGY"){

                    code="1BT";
                }else if(o=="BANGALORE COLLEGE OF ENGINEERING AND TECHNOLOGY"){

                    code="1BC";
                }else if(o=="ALPHA COLLEGE OF ENGINEERING"){

                    code="1AC";
                }else if(o=="BANGALORE INSTITUTE OF TECHNOLOGY"){

                    code="1BI";
                }else if(o=="BMS COLLEGE OF ENGINEERING"){

                    code="1BM";
                }else if(o=="BMS EVENING COLLEGE OF ENGINEERING"){

                    code="1BE";
                }else if(o=="BMS INSTITUTE OF TECHNOLOGY"){

                    code="1BY";
                }else if(o=="BRINDAVAN COLLEGE OF ENGG"){

                    code="1BO";
                }else if(o=="C.M.R INSTITUTE OF TECHNOLOGY"){

                    code="1CR";
                }else if(o=="CAMBRIDGE INSTITUTE OF TECHNOLOGY"){

                    code="1CD";
                }else if(o=="CHANNA BASAVESHWARA INSTITUTE OF TECHNOLOGY"){

                    code="1CG";
                }else if(o=="CITY ENGINEERING COLLEGE"){

                    code="1CE";
                }else if(o=="DAYANANDA SAGAR COLLEGE OF ENGINEERING"){

                    code="1DS";
                }else if(o=="DON BOSCO INSTITUTE OF TECHNOLOGY"){

                    code="1DB";
                }else if(o=="DR. T THIMAIAH INSTITUTE OF TECHNOLOGY"){

                    code="1GV";
                }else if(o=="DR. AMBEDKAR INSTITUTE OF TECHNOLOGY"){

                    code="1DA";
                }else if(o=="EAST POINT COLLEGE OF ENGINEERING AND TECHNOLOGY"){

                    code="1EP";
                }else if(o=="EAST WEST INSTITUTE OF TECHNOLOGY"){

                    code="1EW";
                }else if(o=="GHOUSIA COLLEGE OF ENGINEERING"){

                    code="1GC";
                }else if(o=="GLOBAL ACADEMY OF TECHNOLOGY"){

                    code="1GA";
                }else if(o=="GOVERNMENT S.K.S.J.T. INSTITUTE OF TECHNOLOGY"){

                    code="1SK";
                }else if(o=="GOVERNMENT SKSJT EVENING COLLEGE"){

                    code="1SE";
                }


                else if(o=="A.P.S COLLEGE OF ENGINEERING"){

                    code="1AP";
                } if(o=="ALPHA COLLEGE OF ENGINEERING"){

                    code="1AC";
                }else if(o=="AMC ENGINEERING COLLEGE"){

                    code="1AM";
                }else if(o=="AMRUTHA INSTITUTE OF ENGINEERING AND MGMT SCIENCES"){

                    code="1AR";
                }else if(o=="ATRIA INSTITUTE OF TECHNOLOGY"){

                    code="1AT";
                }else if(o=="B.N.M.INSTITUTE OF TECHNOLOGY"){

                    code="1BG";
                }else if(o=="B.T.L.INSTITUTE OF TECHNOLOGY"){

                    code="1BT";
                }else if(o=="BANGALORE COLLEGE OF ENGINEERING AND TECHNOLOGY"){

                    code="1BC";
                } if(o=="ALPHA COLLEGE OF ENGINEERING"){

                    code="1AC";
                }else if(o=="BANGALORE INSTITUTE OF TECHNOLOGY"){

                    code="1BI";
                }else if(o=="BMS COLLEGE OF ENGINEERING"){

                    code="1BM";
                }else if(o=="BMS EVENING COLLEGE OF ENGINEERING"){

                    code="1BE";
                }else if(o=="BMS INSTITUTE OF TECHNOLOGY"){

                    code="1BY";
                }else if(o=="BRINDAVAN COLLEGE OF ENGG"){

                    code="1BO";
                }else if(o=="C.M.R INSTITUTE OF TECHNOLOGY"){

                    code="1CR";
                } if(o=="CAMBRIDGE INSTITUTE OF TECHNOLOGY"){

                    code="1CD";
                }else if(o=="CHANNA BASAVESHWARA INSTITUTE OF TECHNOLOGY"){

                    code="1CG";
                }else if(o=="CITY ENGINEERING COLLEGE"){

                    code="1CE";
                }else if(o=="DAYANANDA SAGAR COLLEGE OF ENGINEERING"){

                    code="1DS";
                }else if(o=="DON BOSCO INSTITUTE OF TECHNOLOGY"){

                    code="1DB";
                }else if(o=="DR. T THIMAIAH INSTITUTE OF TECHNOLOGY"){

                    code="1GV";
                }else if(o=="DR. AMBEDKAR INSTITUTE OF TECHNOLOGY"){

                    code="1DA";
                } if(o=="EAST POINT COLLEGE OF ENGINEERING AND TECHNOLOGY"){

                    code="1EP";
                }else if(o=="EAST WEST INSTITUTE OF TECHNOLOGY"){

                    code="1EW";
                }else if(o=="GHOUSIA COLLEGE OF ENGINEERING"){

                    code="1GC";
                }else if(o=="GLOBAL ACADEMY OF TECHNOLOGY"){

                    code="1GA";
                }else if(o=="GOVERNMENT S.K.S.J.T. INSTITUTE OF TECHNOLOGY"){

                    code="1SK";
                }else if(o=="GOVERNMENT SKSJT EVENING COLLEGE"){

                    code="1SE";
                }















                intent_1.putExtra("college_name",o);
                intent_1.putExtra("elon",code);

                startActivity(intent_1);

                //*************************************************************************




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
    }

    /*
    public void k(View view){


        Intent intent = new Intent(Search_college.this,Other_college.class);


        if(o=="ACHARAYA INSTITUTE OF TECHNOLOGY"){
            code="1AY";
        }else if(o=="A.P.S COLLEGE OF ENGINEERING"){

            code="1AP";
        } if(o=="ALPHA COLLEGE OF ENGINEERING"){

            code="1AC";
        }else if(o=="AMC ENGINEERING COLLEGE"){

            code="1AM";
        }else if(o=="AMRUTHA INSTITUTE OF ENGINEERING AND MGMT SCIENCES"){

            code="1AR";
        }else if(o=="ATRIA INSTITUTE OF TECHNOLOGY"){

            code="1AT";
        }else if(o=="B.N.M.INSTITUTE OF TECHNOLOGY"){

            code="1BG";
        }else if(o=="B.T.L.INSTITUTE OF TECHNOLOGY"){

            code="1BT";
        }

        intent.putExtra("college_name",o);
        intent.putExtra("elon",code);

        startActivity(intent);

    }

     */

    @Override
    public void onBackPressed() {
        int a=5;
        if(a==3){
        }
        else{
            super.onBackPressed();
        }
        /*
        Intent intent = new Intent(Search_college.this,Other_college.class);
        startActivity(intent);
        finish();

         */

    }
}
