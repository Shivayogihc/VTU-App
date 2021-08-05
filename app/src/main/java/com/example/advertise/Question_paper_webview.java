package com.example.advertise;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Question_paper_webview extends AppCompatActivity {


    WebView webView;


    String code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_paper_webview);



        FloatingActionButton button;


        button = findViewById(R.id.downloadButton);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String t="https://docs.google.com/uc?authuser=0&id=1P_mAa5J67nbeBZXP-uFA-w0gmNk20Dpf";
                String l="&export=download";
                //https://docs.google.com/uc?authuser=0&id=  1UlrG-dBmHaB7l8iZ2A-k8phs7MxP7OXl  &export=download
                String o=t+code+l;
                webView.loadUrl(o);

            }
        });






        webView=findViewById(R.id.drive);
        WebSettings webSettings =webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);//NEW
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webSettings.setEnableSmoothTransition(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient(){
            public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback){
                callback.invoke(origin,true,false);
            }
        });
        //webView.getSettings().setGeolocationDatabasePath(getContext().getFilesDir().getPath());
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);

        webView.setWebViewClient(
                new WebViewClient() {
            @SuppressLint("WrongConstant")
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {


                return false;


            }

        });


        Intent intent = getIntent();
        code = intent.getStringExtra("sub");


        //https://drive.google.com/open?id=1KsKd4vdCIHCPzXy3_KQoIqXw2P3Kjtge

        //String n=b+code;

        //  https://drive.google.com/file/d/1KsKd4vdCIHCPzXy3_KQoIqXw2P3Kjtge/view?usp=sharing

        //https://drive.google.com/file/d/1P_mAa5J67nbeBZXP-uFA-w0gmNk20Dpf/view?usp=sharing

        //https://drive.google.com/file/d/1P_mAa5J67nbeBZXP-uFA-w0gmNk20Dpf/view?usp=sharing


        /*
        String b="https://drive.google.com/file/d/";
        String mo="/view?usp=sharing";


        String n=b+code+mo;

         */


        String b="https://drive.google.com/open?id="+code;
        webView.loadUrl(b);






        //https://docdro.id/xb90MWU



        webView.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_3,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_3));
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
            Intent intent = new Intent(Question_paper_webview.this,cs_sem_1_subject.class);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            startActivity(intent);

         */


    }



}

