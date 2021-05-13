package com.example.ensinopar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AlunoTurmasAdapter extends RecyclerView.Adapter<AlunoTurmasViewHolder> {

    private Context context;
    private ArrayList<TurmasAluno> itens;


    public AlunoTurmasAdapter(Context context, ArrayList<TurmasAluno> itens) {
        this.context = context;
        this.itens = itens;
    }

    @NonNull
    @Override
    public AlunoTurmasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.aluno_turmas_vh,parent,false);
        AlunoTurmasViewHolder viewHolder = new AlunoTurmasViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AlunoTurmasViewHolder holder, int position) {
       TurmasAluno turmasAluno = itens.get(position);
       holder.nometurma.setText(turmasAluno.getNome());

    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
