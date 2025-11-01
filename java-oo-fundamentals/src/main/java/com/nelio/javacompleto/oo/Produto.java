package com.nelio.javacompleto.oo;

/**
 * Classe que representa um Produto no sistema
 * Demonstra conceitos de encapsulamento e OO
 */
public class Produto {
    
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return nome + ", R$ " 
            + String.format("%.2f", preco) 
            + ", " + quantidade 
            + " unidades, Total: R$ " 
            + String.format("%.2f", valorTotalEmEstoque());
    }
}
