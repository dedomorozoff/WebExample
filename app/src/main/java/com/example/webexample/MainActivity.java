package com.example.webexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = findViewById(R.id.w1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://masha.vestaweb.ru");
    }
}
