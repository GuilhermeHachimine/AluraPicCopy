package com.example.ensinopar.beans;

public class Encontro_bean {
    private String id;
    private String fk_codigoEnsino;
    private String fk_codigoAprendizado;
    private String local;

    public Encontro_bean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFk_codigoEnsino() {
        return fk_codigoEnsino;
    }

    public void setFk_codigoEnsino(String fk_codigoEnsino) {
        this.fk_codigoEnsino = fk_codigoEnsino;
    }

    public String getFk_codigoAprendizado() {
        return fk_codigoAprendizado;
    }

    public void setFk_codigoAprendizado(String fk_codigoAprendizado) {
        this.fk_codigoAprendizado = fk_codigoAprendizado;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Encontro_bean{" +
                "id='" + id + '\'' +
                ", fk_codigoEnsino='" + fk_codigoEnsino + '\'' +
                ", fk_codigoAprendizado='" + fk_codigoAprendizado + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}
