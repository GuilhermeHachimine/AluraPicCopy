package com.example.ensinopar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class Reuniao_aluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Reuniões");
        setContentView(R.layout.activity_reuniao_aluno);

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

                        break;

                    case R.id.a_home:
                        startActivity(new Intent(getApplicationContext(), Home_aluno.class));
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