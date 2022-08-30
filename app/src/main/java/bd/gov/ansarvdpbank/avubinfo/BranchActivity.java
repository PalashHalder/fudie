package bd.gov.ansarvdpbank.avubinfo;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;


public class BranchActivity extends AppCompatActivity {

    WebView webView;

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);

        progressBar = findViewById(R.id.progressBar);

        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);       // To enable JavaScript of the website


        webView.loadUrl("https://docs.google.com/spreadsheets/d/1dDQV4UXbbgIRXOKmPA0pu3XRt_GhOSXwe8DG4lGz-i4/edit?usp=sharing");        //  URL of the website

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                progressBar.setVisibility(View.VISIBLE);
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                progressBar.setVisibility(View.GONE);
                super.onPageFinished(view, url);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return super.shouldOverrideUrlLoading(view, url);
            }
        });

        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {

                super.onProgressChanged(view, newProgress);

                progressBar.setProgress(newProgress);
            }
        });

    }
    // This section is for working back button
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}