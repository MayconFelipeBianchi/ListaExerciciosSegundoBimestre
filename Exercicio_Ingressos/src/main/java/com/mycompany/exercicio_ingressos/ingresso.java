
package com.mycompany.exercicio_ingressos;

public class ingresso {
    private double valor;

    public ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ingresso com valor de R$" + String.format("%.2f", valor);
    }
}