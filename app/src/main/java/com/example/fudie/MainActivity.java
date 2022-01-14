package com.example.fudie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    BottomNavigationView botNav;
    View bankIntro;
    View mission;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        bankIntro = findViewById(R.id.bankIntro);
        mission = findViewById(R.id.missionImage);



        setSupportActionBar(toolbar);

        // toolbar.setNavigationIcon(R.drawable.ic_coffee_cup);

        drawerLayout = findViewById(R.id.drawerLay);
        navigationView = findViewById(R.id.navView);
        botNav = findViewById(R.id.botNav);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar,R.string.drawerOpen,R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24); //

        bankIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, BankIntro.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();

            }
        });

        mission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, MissionActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();

            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.menuIntro:
                        Intent intent= new Intent(MainActivity.this, BankIntro.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "Bank Introduction", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.menuMission:
                        intent = new Intent(MainActivity.this, MissionActivity.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "Bank Mission", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.menuLoan:
                        Toast.makeText(MainActivity.this, "Loan Products", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.menuDeposit:
                        Toast.makeText(MainActivity.this, "Deposit Information", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.menuShare:
                        Toast.makeText(MainActivity.this, "Share Information", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.menuOffice:
                        Toast.makeText(MainActivity.this, "Office Information", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.menuContact:
                        Toast.makeText(MainActivity.this, "Contact Information", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.menuFaqs:
                        Toast.makeText(MainActivity.this, "General Question", Toast.LENGTH_SHORT).show();
                        break;
                }

                return false;
            }
        });

        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.burger_bot:
                        Toast.makeText(MainActivity.this, "B Bot", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.coffee_bot:
                        Toast.makeText(MainActivity.this, "C Bot", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.pizza_bot:
                        Toast.makeText(MainActivity.this, "P Bot", Toast.LENGTH_SHORT).show();
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

            case R.id.coffee:
                Toast.makeText(this, "The page is under construction", Toast.LENGTH_SHORT).show();
                break;

            case R.id.burger:
                Toast.makeText(this, "The page is under construction", Toast.LENGTH_SHORT).show();
                break;

            case R.id.pizza:
                Toast.makeText(this, "The page is under construction", Toast.LENGTH_SHORT).show();
                break;

            case R.id.share:
                Toast.makeText(this, "The page is under construction", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
}