package com.example.ensinopar.beans;

public class Curso_bean {
    private String id;
    private String nome;
    private String instituicao;

    public Curso_bean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public String toString() {
        return "Curso_bean{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", instituicao='" + instituicao + '\'' +
                '}';
    }
}
