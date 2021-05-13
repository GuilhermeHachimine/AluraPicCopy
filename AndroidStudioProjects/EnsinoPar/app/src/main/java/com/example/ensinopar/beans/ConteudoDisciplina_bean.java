package com.example.ensinopar.beans;

public class ConteudoDisciplina_bean {
    private String id;
    private String nome;
    private String fk_codigoDisciplina;

    public ConteudoDisciplina_bean() {
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

    public String getFk_codigoDisciplina() {
        return fk_codigoDisciplina;
    }

    public void setFk_codigoDisciplina(String fk_codigoDisciplina) {
        this.fk_codigoDisciplina = fk_codigoDisciplina;
    }

    @Override
    public String toString() {
        return "ConteudoDisciplina_bean{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", fk_codigoDisciplina='" + fk_codigoDisciplina + '\'' +
                '}';
    }
}
