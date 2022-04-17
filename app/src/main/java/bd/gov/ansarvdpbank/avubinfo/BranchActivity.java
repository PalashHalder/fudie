package bd.gov.ansarvdpbank.avubinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BranchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("branches.pdf").load();
    }
}