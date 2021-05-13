package com.example.ensinopar.beans;

public class Aprender_bean {
    private String id;
    private String fk_RA;
    private String fk_CodigoConteudo;

    public Aprender_bean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFk_RA() {
        return fk_RA;
    }

    public void setFk_RA(String fk_RA) {
        this.fk_RA = fk_RA;
    }

    public String getFk_CodigoConteudo() {
        return fk_CodigoConteudo;
    }

    public void setFk_CodigoConteudo(String fk_CodigoConteudo) {
        this.fk_CodigoConteudo = fk_CodigoConteudo;
    }

    @Override
    public String toString() {
        return "Aprender_bean{" +
                "id='" + id + '\'' +
                ", fk_RA='" + fk_RA + '\'' +
                ", fk_CodigoConteudo='" + fk_CodigoConteudo + '\'' +
                '}';
    }
}
