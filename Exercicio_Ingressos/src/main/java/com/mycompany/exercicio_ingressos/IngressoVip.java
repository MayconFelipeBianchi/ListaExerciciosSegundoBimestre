package com.mycompany.exercicio_ingressos;

public class IngressoVip extends ingresso {

    private double valorAdicional;

   public IngressoVip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }
    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "Ingresso VIP com valor de R$" + String.format("%.2f", getValor() + valorAdicional);
    }
}
