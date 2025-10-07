
package com.mycompany.sistemadebiblioteca;

public class Livro {

    public String titulo;
    public String autor;
    public boolean disponível;

    public Livro(String titulo , String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponível = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponível() {
        return disponível;
    }

    public void setDisponível(boolean disponível) {
        this.disponível = disponível;
    }

    @Override
    public String toString() {
        return super.toString();

    }

    void setDisponivel(boolean b) {
        this.disponível = disponível;
    }

    boolean isDisponivel() {
        return disponível;
    }
}
