package com.example.advertise;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class cs_sem_1_subject_fragment extends Fragment implements View.OnClickListener {
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.sem_1_subject, container, false);

        Button button = v.findViewById(R.id.m1);
        button.setOnClickListener(this);





        return v;
    }



    public void questions(View view){




    }

    @Override
    public void onClick(View v) {

    }

    public interface OnFragmentInteractionListener {
    }
}
