package com.example.ensinopar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class Reuniao_professor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Reuniões Professor");
        setContentView(R.layout.activity_reuniao_professor);
        //Inicializar e declara variavel

        BottomNavigationView bottomNavigationView = findViewById(R.id.professor_bottom_navigation);

        //Setar tela Home
        bottomNavigationView.setSelectedItemId(R.id.a_home);

        //Realizar ItemSelectedListener
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.a_reuniao:

                        break;

                    case R.id.a_home:
                        startActivity(new Intent(getApplicationContext(), Home_professor.class));
                        overridePendingTransition(0,0);
                        break;

                    case R.id.a_logout:
                        FirebaseAuth.getInstance().signOut();
                        startActivity(new Intent(getApplicationContext(),Login.class));
                        finish();
                        overridePendingTransition(0,0);
                        break;

                }
            }
        });
    }
}