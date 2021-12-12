package com.example.Desafiosdio;

public abstract class Conteudo {
    // final representa um constante nao muda
    // static = pode ser acessado fora da classe Conteudo
    // protected somente filhos Conteudo terao acesso
    protected   static final double XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    // abstract => nao conseguir criar conteudo
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
