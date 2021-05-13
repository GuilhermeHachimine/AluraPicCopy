package com.example.ensinopar.beans;

public class DiaEnsino_bean {//Dia para o aluno que ensina
    private String id;
    private String fk_codigoEnsino;
    private boolean estaMarcado; // Se True entao sim, se False entao nao
    private int ano;
    private int mes;
    private int dia;
    private int horaIni;
    private int minIni;
    private int horaFin;
    private int minFin;

    public boolean isEstaMarcado() {
        return estaMarcado;
    }

    public void setEstaMarcado(boolean estaMarcado) {
        this.estaMarcado = estaMarcado;
    }

    public DiaEnsino_bean() {
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(int horaIni) {
        this.horaIni = horaIni;
    }

    public int getMinIni() {
        return minIni;
    }

    public void setMinIni(int minIni) {
        this.minIni = minIni;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public int getMinFin() {
        return minFin;
    }

    public void setMinFin(int minFin) {
        this.minFin = minFin;
    }

    @Override
    public String toString() {
        return "DiaEnsino_bean{" +
                "id='" + id + '\'' +
                ", fk_codigoEnsino='" + fk_codigoEnsino + '\'' +
                ", estaMarcado=" + estaMarcado +
                ", ano=" + ano +
                ", mes=" + mes +
                ", dia=" + dia +
                ", horaIni=" + horaIni +
                ", minIni=" + minIni +
                ", horaFin=" + horaFin +
                ", minFin=" + minFin +
                '}';
    }
}
