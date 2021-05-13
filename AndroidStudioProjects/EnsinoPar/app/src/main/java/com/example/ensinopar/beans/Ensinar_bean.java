package com.example.ensinopar.beans;

public class Ensinar_bean {
    private String id;
    private String fk_RA;
    private String fk_codigoConteudo;

    public Ensinar_bean() {
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

    public String getFk_codigoConteudo() {
        return fk_codigoConteudo;
    }

    public void setFk_codigoConteudo(String fk_codigoConteudo) {
        this.fk_codigoConteudo = fk_codigoConteudo;
    }

    @Override
    public String toString() {
        return "Ensinar_bean{" +
                "id='" + id + '\'' +
                ", fk_RA='" + fk_RA + '\'' +
                ", fk_codigoConteudo='" + fk_codigoConteudo + '\'' +
                '}';
    }
}
