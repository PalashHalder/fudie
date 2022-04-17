package bd.gov.ansarvdpbank.avubinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class RegionalOffices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regional_offices);

        //TextView textView = findViewById(R.id.textView);
        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("regional_managers.pdf").load();
    }
}