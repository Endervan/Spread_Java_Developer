package com.example.Desafiosdio;

public class Curso {

    String nome;
    String descricao;
    int cargaMentoria;

    public Curso() {
    }

    public String getTitulo() {
        return nome;
    }

    public void setTitulo(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaMentoria() {
        return cargaMentoria;
    }

    public void setCargaMentoria(int cargaMentoria) {
        this.cargaMentoria = cargaMentoria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaMentoria=" + cargaMentoria +
                '}';
    }
}
