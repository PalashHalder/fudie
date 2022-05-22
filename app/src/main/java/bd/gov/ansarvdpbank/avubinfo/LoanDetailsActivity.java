package bd.gov.ansarvdpbank.avubinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.github.barteksc.pdfviewer.PDFView;

import de.hdodenhof.circleimageview.CircleImageView;

public class LoanDetailsActivity extends AppCompatActivity {

    ImageView coverImg;
    CircleImageView ProfileImageView;

    TextView nameTV;
    TextView statusTV;

    Intent intent;
    String imageUrl, name, status, pdfUrl;              //pdfUrl can be
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_details);

        intent = getIntent();

        imageUrl = intent.getStringExtra("img");
        name = intent.getStringExtra("name");
        status = intent.getStringExtra("status");
        pdfUrl = intent.getStringExtra("pdf");


        coverImg = findViewById(R.id.coverImg);
        ProfileImageView = findViewById(R.id.product_img_url);


        nameTV = findViewById(R.id.productName);
        statusTV = findViewById(R.id.productStatus);
        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset(pdfUrl).load();


        nameTV.setText(name);
        statusTV.setText(status);

        Glide.with(LoanDetailsActivity.this).load(imageUrl).into(coverImg);
        Glide.with(LoanDetailsActivity.this).load(imageUrl).into(ProfileImageView);
    /*
        if (pdfUrl.equals("")) {
            Toast.makeText(this, "No Pdf Available", Toast.LENGTH_SHORT).show();
        } else {
            pdfView.fromAsset(pdfUrl).load();
        }

     */

    }
}