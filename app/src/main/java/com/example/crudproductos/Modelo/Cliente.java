package com.example.crudproductos.Modelo;

public class Cliente {
    private int id;
    private String ruc;
    private String nom;

    private String dir;

    public Cliente() {
        ;
    }

    public Cliente(String dir, String nom, String ruc, int id) {
        this.dir = dir;
        this.nom = nom;
        this.ruc = ruc;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", ruc='" + ruc + '\'' +
                ", nom='" + nom + '\'' +
                ", dir='" + dir + '\'' +
                '}';
    }
}


