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
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {
    EditText mNomeCompleto,mEmail,mSenha,mPhone;
    Button mRegisterbt;
    TextView mLoginbt;

    //Autenticação FireBase
    FirebaseAuth fAuth;
    ProgressBar progressBar;
    //Banco de Dados
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        //Inicializar vars
        mNomeCompleto   = findViewById(R.id.register_fullname_et);
        mEmail          = findViewById(R.id.register_email_et);
        mSenha          = findViewById(R.id.register_senha_et);
        mPhone          = findViewById(R.id.register_telefone_et);
        mRegisterbt     = findViewById(R.id.register_confirm_bt);
        mLoginbt        = findViewById(R.id.register_loginreturn_tv);

        fAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.register_pb);
        //Firebase


        if(fAuth.getCurrentUser()!= null)
        {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }

        //CONFIRMAR BOTAO
        mRegisterbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email        = mEmail.getText().toString().trim();
                String senha        = mSenha.getText().toString().trim();
                final String NomeCompleto = mNomeCompleto.getText().toString();
                final String phone        = mPhone.getText().toString();

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


                //Registrar o Usuário no Firebase
                fAuth.createUserWithEmailAndPassword(email,senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(Register.this,"Conta Cadastrada",Toast.LENGTH_LONG).show();
                            userID = fAuth.getCurrentUser().getUid();
                            //Criando um objeto map para inserir dados do usuário
                            Map<String,Object> user = new HashMap<>();
                            user.put("Nome Completo",NomeCompleto);
                            user.put("Email",email);
                            user.put("Telefone",phone);
                            //Inserir no Database
                            inicializaFirebase();
                            databaseReference.child("Usuário").child(userID).setValue(user);
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        }else{
                            Toast.makeText(Register.this,"Erro ! "+task.getException().getMessage(),Toast.LENGTH_LONG).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });



            }
        });

        mLoginbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });


    }

    private void inicializaFirebase()
    {
        FirebaseApp.initializeApp(Register.this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

    }
}