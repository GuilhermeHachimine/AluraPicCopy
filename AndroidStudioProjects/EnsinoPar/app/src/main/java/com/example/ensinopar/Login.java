package com.example.ensinopar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    EditText mEmail, mSenha;
    Button mLoginbt;
    TextView mCriarConta;
    ProgressBar progressBar;
    //Autenticação
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);


        //Inicializando variáveis
        mEmail      = findViewById(R.id.login_email_et);
        mSenha      = findViewById(R.id.login_senha_et);
        progressBar = findViewById(R.id.login_pb);
        fAuth       = FirebaseAuth.getInstance();
        mLoginbt    = findViewById(R.id.login_confirm_bt);
        mCriarConta = findViewById(R.id.login_createac_tv);

        //Botão de login função
        mLoginbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mEmail.getText().toString().trim();
                String senha = mSenha.getText().toString().trim();
                if(TextUtils.isEmpty(email))
                {
                    mEmail.setError("Preencha o campo 'Email'.");
                    return;
                }

                if(TextUtils.isEmpty(senha))
                {
                    mSenha.setError("Preencha o campo 'Senha'.");
                    return;
                }

                if (senha.length()<6)
                {
                    mSenha.setError("A senha precisa ter pelo menos 6 caracteres");
                    return;
                }

                //Rodar o ProgressBar
                progressBar.setVisibility(View.VISIBLE);

                //Autenticando Usuário
                fAuth.signInWithEmailAndPassword(email,senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(Login.this,"Logado Com Sucesso!",Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        }else
                        {
                            Toast.makeText(Login.this,"Erro ! "+task.getException().getMessage(),Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(),Login.class));
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });

        mCriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Register.class));

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser mFirebaseUser = fAuth.getCurrentUser();
        if(mFirebaseUser!=null)
        {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        }
    }
}