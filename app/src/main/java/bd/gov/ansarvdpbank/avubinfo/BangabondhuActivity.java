package bd.gov.ansarvdpbank.avubinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.bumptech.glide.Glide;
import com.github.barteksc.pdfviewer.PDFView;

public class BangabondhuActivity extends AppCompatActivity {

    ImageView coverImage;
    //CircleImageView ProfleImageView;

    TextView nameTv;
    TextView statusTv;

    Intent intent;

    String imageUrl;
    String name;
    String status;
    String pdfUrl;
    PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangabondhu);

        intent = getIntent();

        imageUrl = intent.getStringExtra("img");
        name = intent.getStringExtra("name");
        status = intent.getStringExtra("status");
        pdfUrl = intent.getStringExtra("pdfUrl");


        coverImage = findViewById(R.id.coverImg);
        //ProfleImageView = findViewById(R.id.profile_image);

        nameTv = findViewById(R.id.profileName);
        statusTv = findViewById(R.id.profileStatus);


        pdfView = findViewById(R.id.pdfView);


        nameTv.setText(name);
        statusTv.setText(status);


        Glide.with(BangabondhuActivity.this).load(imageUrl).into(coverImage);
        //Glide.with(BangabondhuActivity.this).load(imageUrl).into(ProfleImageView);

        if (pdfUrl.equals("")) {
            Toast.makeText(this, "No Pdf Available", Toast.LENGTH_SHORT).show();
        } else {
            pdfView.fromAsset(pdfUrl).load();
        }


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}