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

public class pre_web extends AppCompatActivity {


    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_web);
        Intent intent = getIntent();


        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1,this.getTheme()));

        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary_1));
        }

        webView=findViewById(R.id.web_2);
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
                if (url.startsWith("https://m.facebook.com/vtu4u"))
                {

                    ImageView imageView= findViewById(R.id.image_1);
                    imageView.setVisibility(0);
                    View view1 = findViewById(R.id.view);
                    view1.setVisibility(0);
                    webView.loadUrl("https://m.facebook.com");
                    return true;
                }
                return false;


            }

        });


        String j= intent.getStringExtra("lol");
        String c="https://www.vtu4u.com/results/"+j+"?cbse=1";
        webView.loadUrl(c);
    }

    @Override
    public void onBackPressed() {

        if(webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }




        /*
            Intent intent = new Intent(Question_paper_webview.this,cs_sem_1_subject.class);
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            startActivity(intent);

         */


    }


}
