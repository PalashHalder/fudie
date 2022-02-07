package com.example.fudie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import static android.app.ProgressDialog.show;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    BottomNavigationView botNav;
    CardView mainIntro, mainMission, mainShare, mainLoan, mainDeposit, mainOffice, mainQuestion, mainContact, mainHotline, mainSuccess;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar);
        mainIntro = findViewById(R.id.mainIntro);
        mainMission = findViewById(R.id.mainMission);
        mainShare = findViewById(R.id.mainShare);
        mainLoan = findViewById(R.id.mainLoan);
        mainDeposit = findViewById(R.id.mainDeposit);
        mainOffice = findViewById(R.id.mainOffice);
        mainQuestion = findViewById(R.id.mainQuestion);
        mainContact = findViewById(R.id.mainContact);
        mainHotline = findViewById(R.id.mainHotline);
        mainSuccess = findViewById(R.id.mainSuccess);






        setSupportActionBar(toolbar);

        //toolbar.setNavigationIcon(R.drawable.ic_coffee_cup);

        drawerLayout = findViewById(R.id.drawerLay);
        navigationView = findViewById(R.id.navView);
        botNav = findViewById(R.id.botNav);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar,R.string.drawerOpen,R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24); //



        mainIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, BankIntro.class);
                startActivity(intent);
            }
        });

        mainMission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, MissionActivity.class);
                startActivity(intent);
            }
        });

        mainShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, ShareActivity.class);
                startActivity(intent);
            }
        });

        mainLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, LoanActivity.class);
                startActivity(intent);
            }
        });

        mainDeposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, DepositActivity.class);
                startActivity(intent);
            }
        });

        mainOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, OfficeActivity.class);
                startActivity(intent);
            }
        });

        mainQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, QuestionActivity.class);
                startActivity(intent);
            }
        });

        mainContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, ContactActivity.class);
                startActivity(intent);
            }
        });

        mainHotline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, HotlineActivity.class);
                startActivity(intent);
            }
        });

        mainSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, ClientCornerActivity.class);
                startActivity(intent);
            }
        });


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.menuIntro:
                        Intent intent= new Intent(MainActivity.this, BankIntro.class);
                        startActivity(intent);
                        break;

                    case R.id.menuMission:
                        intent = new Intent(MainActivity.this, MissionActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.menuChair:
                        intent = new Intent(MainActivity.this, ChairActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.menuMDirector:
                        intent = new Intent(MainActivity.this, MDirectorActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.menuDmDirector:
                        intent = new Intent(MainActivity.this, DmDirectorActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.menuShare:
                        intent= new Intent(MainActivity.this, ShareActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.menuLoan:
                        intent = new Intent(MainActivity.this, LoanActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.menuDeposit:
                        intent = new Intent(MainActivity.this, DepositActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.menuOffice:
                        intent = new Intent(MainActivity.this, OfficeActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.menuFaqs:
                        intent = new Intent(MainActivity.this, QuestionActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.menuContact:
                        intent = new Intent(MainActivity.this, ContactActivity.class);
                        startActivity(intent);
                        break;
                }

                return false;
            }
        });

        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home_bot:
                        makeText(MainActivity.this, "B Bot", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.portal_bot:
                        makeText(MainActivity.this, "C Bot", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.links_bot:
                        makeText(MainActivity.this, "P Bot", Toast.LENGTH_SHORT).show();
                        break;
                }

                return false;
            }
        });


    }

    public void ViewAll(View view) {
        // Use if need to carry date to the target page
       /* Intent intent = new Intent(MainActivity.this, FullActivity.class);
        startActivity(intent);

        */

        // use when you need not carry data to the target page
        startActivity(new Intent(getApplicationContext(), FullActivity.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.mujib:
                makeText(this, "The page is under construction", Toast.LENGTH_SHORT).show();
                break;

            case R.id.golden:
                makeText(this, "The page is under construction", Toast.LENGTH_SHORT).show();
                break;

            case R.id.share:
                makeText(this, "The page is under construction", Toast.LENGTH_SHORT).show();
                break;

            case R.id.blog:
                makeText(this, "The page is under construction", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
}