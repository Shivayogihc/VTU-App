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
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class Linkedin extends AppCompatActivity {

    String joy;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedin);



        webView=findViewById(R.id.web_3);
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

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_3,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_3));
        }



        /*
        webView.setWebViewClient(new WebViewClient() {
            @SuppressLint("WrongConstant")
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {

                if (Uri.parse(url).getScheme().equals("market")) {
                    try {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        Activity host = (Activity) view.getContext();
                        host.startActivity(intent);
                        return true;
                    } catch (ActivityNotFoundException e) {
                        // Google Play app is not installed, you may want to open the app store link
                        Uri uri = Uri.parse(url);
                        view.loadUrl("http://play.google.com/store/apps/" + uri.getHost() + "?" + uri.getQuery());
                        return false;
                    }
                }
                if (url.startsWith("https://"))
                {
                    Uri uri = Uri.parse(url);

                    ImageView imageView= findViewById(R.id.image_1);
                    imageView.setVisibility(0);
                    View view1 = findViewById(R.id.view);
                    view1.setVisibility(0);
                    webView.loadUrl(""+ uri.getHost()+uri.getQuery());
                    return true;
                }
                return false;


            }

        });

         */


        //*****************************
        Intent intent = getIntent();

        String url = intent.getStringExtra("link");

        //***************************************




        //String c="https://www.linkedin.com";
        webView.loadUrl(url);
    }


    @Override
    public void onBackPressed() {

        webView.goBack();

        /*
        if(webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }

         */




        /*
            Intent intent = new Intent(Question_paper_webview.this,cs_sem_1_subject.class);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            startActivity(intent);

         */


    }
}
