package bd.gov.ansarvdpbank.avubinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.github.barteksc.pdfviewer.PDFView;

public class ClientCornerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_corner);


        PDFView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("success_story.pdf").load();


    }
}