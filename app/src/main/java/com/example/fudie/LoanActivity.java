package com.example.fudie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;
import java.util.List;

public class LoanActivity extends AppCompatActivity {

    private List<LoanProducts>loanProductsList;
    RecyclerView recyclerView;
    LoanAdapter loanAdapter;

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);

        loanProductsList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        loanAdapter = new LoanAdapter(loanProductsList);
        recyclerView.setAdapter(loanAdapter);

        loanProductsList.add(new LoanProducts("", "ক্ষৃদ্রঋণ", "", R.drawable.micro));
        loanProductsList.add(new LoanProducts("", "এসএমই ঋণ", "", R.drawable.medecine));
        loanProductsList.add(new LoanProducts("", "গবাদি পশু পালন ঋণ", "", R.drawable.cattle));
        loanProductsList.add(new LoanProducts("", "পুকুরে মৎস্য চাষ ঋণ", "", R.drawable.fish));
        loanProductsList.add(new LoanProducts("", "দুগ্ধবতী গাভীপালন ঋণ", "", R.drawable.cow));
        loanProductsList.add(new LoanProducts("", "গরু মোটাতাজাকরণ ঋণ", "", R.drawable.beaf_fattening));
        loanProductsList.add(new LoanProducts("", "পোল্ট্রি  ‍মুরগি পালন ঋণ", "", R.drawable.hen));
        loanProductsList.add(new LoanProducts("", "কৃত্রিম প্রজনন ঋণ", "", R.drawable.artificial));
        loanProductsList.add(new LoanProducts("", "নারী কর্মসৃজন ঋণ", "", R.drawable.nari));
        loanProductsList.add(new LoanProducts("", "আনসার হোম লোন", "",  R.drawable.ansar));

        loanAdapter.notifyDataSetChanged();
    }
}