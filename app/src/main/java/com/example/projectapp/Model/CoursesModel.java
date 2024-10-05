package com.example.projectapp.Model;

public class CoursesModel {
    private String titulo;
    private double valor;
    private String picPath; //ruta de la imagen

    public CoursesModel(String titulo, double valor, String picPath) {
        this.titulo = titulo;
        this.valor = valor;
        this.picPath = picPath;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
