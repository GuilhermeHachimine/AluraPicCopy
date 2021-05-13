package com.example.ensinopar.beans;

public class Disciplina_bean {
    private String id;
    private String nome;
    private String fk_matriculaProfessor;
    private int AnoDaOferta;
    private String fk_CodigoCurso;
    private String Ano_Periodo;


    public Disciplina_bean() {
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

    public String getFk_matriculaProfessor() {
        return fk_matriculaProfessor;
    }

    public void setFk_matriculaProfessor(String fk_matriculaProfessor) {
        this.fk_matriculaProfessor = fk_matriculaProfessor;
    }

    public int getAnoDaOferta() {
        return AnoDaOferta;
    }

    public void setAnoDaOferta(int anoDaOferta) {
        AnoDaOferta = anoDaOferta;
    }

    public String getFk_CodigoCurso() {
        return fk_CodigoCurso;
    }

    public void setFk_CodigoCurso(String fk_CodigoCurso) {
        this.fk_CodigoCurso = fk_CodigoCurso;
    }

    public String getAno_Periodo() {
        return Ano_Periodo;
    }

    public void setAno_Periodo(String ano_Periodo) {
        Ano_Periodo = ano_Periodo;
    }

    @Override
    public String toString() {
        return "Disciplina_bean{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", fk_matriculaProfessor='" + fk_matriculaProfessor + '\'' +
                ", AnoDaOferta='" + AnoDaOferta + '\'' +
                ", fk_CodigoCurso='" + fk_CodigoCurso + '\'' +
                ", Ano_Periodo='" + Ano_Periodo + '\'' +
                '}';
    }
}
