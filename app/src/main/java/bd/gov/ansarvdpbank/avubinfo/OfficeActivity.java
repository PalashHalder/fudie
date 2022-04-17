package bd.gov.ansarvdpbank.avubinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



import static android.widget.Toast.makeText;

public class OfficeActivity extends AppCompatActivity {

    CardView management, hoDivisions, regionalOff, regionalAudit, branches;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);

        management = findViewById(R.id.management);
        hoDivisions = findViewById(R.id.hoDivisions);
        regionalOff = findViewById(R.id.regionalOff);
        regionalAudit = findViewById(R.id.regionalAudit);
        branches = findViewById(R.id.branches);

        management.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(OfficeActivity.this, ChairAddActivity.class);
                startActivity(intent);
            }
        });

        hoDivisions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(OfficeActivity.this, DivisionActivity.class);
                startActivity(intent);
            }
        });

        regionalOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(OfficeActivity.this, RegionalOffices.class);
                startActivity(intent);
            }
        });

        regionalAudit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(OfficeActivity.this, AuditActivity.class);
                startActivity(intent);
            }
        });

        branches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(OfficeActivity.this, BranchActivity.class);
                startActivity(intent);
            }
        });

    }
}