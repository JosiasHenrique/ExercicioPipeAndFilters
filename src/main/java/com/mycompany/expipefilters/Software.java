package com.mycompany.expipefilters;

/**
 *
 * @author Josias
 */
public class Software {

    private String nome;
    private String tipo;
    private String so;
    private double preco;

    public Software() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " (" + tipo + ", " + so + ") - $" + preco;
    }
}
