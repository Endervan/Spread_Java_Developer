package com.example.Desafiosdio;

import java.time.LocalDate;

public class Mentoria {

   private String nome;
  private String descricao;
   private LocalDate data;

    public Mentoria() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
