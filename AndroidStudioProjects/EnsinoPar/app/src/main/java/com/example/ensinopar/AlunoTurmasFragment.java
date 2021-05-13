package com.example.ensinopar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class AlunoTurmasFragment extends Fragment {

    View view;
    private RecyclerView recyclerView;
    private AlunoTurmasAdapter alunoTurmasAdapter;
    private ArrayList<TurmasAluno> itens;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_aluno_turmas, container, false);
        //recyclerView = view.findViewById(view.)

        return view;
    }
}