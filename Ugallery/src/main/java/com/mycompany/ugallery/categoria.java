package com.mycompany.ugallery;
public class categoria {
    public String usuario;
    public String nombre;

    listaDoble imagenes = new listaDoble();

    public categoria(String nombre, String usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public listaDoble getListImagenes() {
        return this.imagenes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagenes(listaDoble imagenes) {
        this.imagenes = imagenes;
    }

    public String getUsuario() {
        return usuario;
    }


}
