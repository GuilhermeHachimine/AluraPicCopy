package com.example.ensinopar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Logout_aluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Logout");
        setContentView(R.layout.activity_logout_aluno);
        //Inicializar e declara variavel

        BottomNavigationView bottomNavigationView = findViewById(R.id.aluno_bottom_navigation);

        //Setar tela Home
        bottomNavigationView.setSelectedItemId(R.id.a_home);

        //Realizar ItemSelectedListener
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.a_reuniao:
                        startActivity(new Intent(getApplicationContext(),Reuniao_aluno.class));
                        overridePendingTransition(0,0);
                        break;

                    case R.id.a_home:
                        startActivity(new Intent(getApplicationContext(), Home_aluno.class));
                        overridePendingTransition(0,0);
                        break;

                    case R.id.a_logout:

                        break;

                }
            }
        });
    }
}