package com.example.fudie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AgriRuralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agri_rural);

        PDFView pdfView = findViewById(R.id.recyclerView);

        pdfView.fromAsset("rural_credit.pdf").load();

    }
}