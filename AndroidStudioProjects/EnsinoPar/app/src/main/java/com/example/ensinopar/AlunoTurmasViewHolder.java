package com.example.ensinopar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlunoTurmasViewHolder extends RecyclerView.ViewHolder {
    TextView nometurma;
    Button   acessarbotao;


    public AlunoTurmasViewHolder(@NonNull View itemView) {
        super(itemView);
        nometurma = itemView.findViewById(R.id.aluno_turmas_vh_nome_tv);
        acessarbotao = itemView.findViewById(R.id.aluno_turmas_vh_bt);
    }
}
