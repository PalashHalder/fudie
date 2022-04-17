package bd.gov.ansarvdpbank.avubinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class PortalActivity extends AppCompatActivity {

    ProgressBar progressBar;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);

        progressBar = findViewById(R.id.progressBar);

        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);   // To enable JavaScript of the website
        webView.loadUrl("http://ansarvdpbank.portal.gov.bd/site/page/b3503923-1afb-4028-89f0-ec6de68188d6");        //  URL of the website

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