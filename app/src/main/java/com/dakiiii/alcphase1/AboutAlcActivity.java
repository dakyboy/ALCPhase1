package com.dakiiii.alcphase1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.net.http.SslError;
import android.os.Bundle;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlcActivity extends AppCompatActivity {
    private final String ABOUT_ALC = "https://andela.com/alc/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        WebView aboutAlcWebView = findViewById(R.id.about_alc_webview);
//        setContentView(aboutAlcWebView);
        Toolbar aboutAlcToolbar = findViewById(R.id.toolbar_about_alc);
        aboutAlcToolbar.setTitle("About Alc");
        setSupportActionBar(aboutAlcToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        aboutAlcWebView.getSettings().setDomStorageEnabled(true);
        aboutAlcWebView.getSettings().setJavaScriptEnabled(true);
        aboutAlcWebView.getSettings().setLoadsImagesAutomatically(true);
        aboutAlcWebView.setWebViewClient(new MyWebView());
        aboutAlcWebView.loadUrl(ABOUT_ALC);
    }

    private class MyWebView extends WebViewClient {

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            super.onReceivedSslError(view, handler, error);
            handler.proceed();
            Log.w(ABOUT_ALC, error.toString());
        }
    }
}
