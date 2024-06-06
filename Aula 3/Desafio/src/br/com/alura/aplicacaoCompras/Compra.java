package br.com.alura.aplicacaoCompras;

import java.util.Comparator;

public class Compra implements Comparable<Compra>{
    private String nome;
    private double preco;

    public Compra(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.getPreco()).compareTo(Double.valueOf(outraCompra.getPreco()));
    }
}
