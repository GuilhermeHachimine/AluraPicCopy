package com.example.ensinopar.beans;

public class Aluno_bean {

    private String RA;
    private String Curso;
    private String Nome;
    private String Telefone;
    private String email;

    public Aluno_bean() {

    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno_bean{" +
                "RA='" + RA + '\'' +
                ", Curso='" + Curso + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Telefone='" + Telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
