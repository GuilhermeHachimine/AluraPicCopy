package com.example.ensinopar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class Home_aluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Home");
        setContentView(R.layout.activity_home_aluno);


        //Inicializar e declara variavel

        BottomNavigationView bottomNavigationView = findViewById(R.id.aluno_bottom_navigation);

        //Setar tela Home
        bottomNavigationView.setSelectedItemId(R.id.a_home);


        //Setando fragment padrão turmas
        setFragment(new AlunoTurmasFragment());



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

    private void setFragment(Fragment Fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.activity_home_aluno_FragmentScreen,Fragment);
        fragmentTransaction.commit();
    }
}