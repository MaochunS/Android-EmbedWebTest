package com.maochun.embededwebpagetest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onResume(){
        super.onResume();

        String url = "https://wallet.secuxtech.com/SecuXcess/";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder().setShowTitle(true);


        builder.setToolbarColor(ContextCompat.getColor(this, R.color.colorTitleBar));
        builder.enableUrlBarHiding();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));



        //showProgress("Loading...");
        /*
        final WebView detailWebView = findViewById(R.id.webview_main);
        //detailWebView.getSettings().setBuiltInZoomControls(true);
        detailWebView.getSettings().setJavaScriptEnabled(true);
        detailWebView.getSettings().setDomStorageEnabled(true);


        detailWebView.getSettings().setLoadWithOverviewMode(true);
        detailWebView.getSettings().setUseWideViewPort(true);
        detailWebView.setInitialScale(1);
        detailWebView.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageFinished(WebView view, String url) {
                //hideProgressInMain();
            }
        });

         */

        //detailWebView.loadUrl("https://www.secuxtech.com");
        //detailWebView.loadUrl("https://wallet.secuxtech.com/SecuXcess/");



    }
}
