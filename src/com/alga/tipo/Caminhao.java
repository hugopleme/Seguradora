package com.alga.tipo;

public class Caminhao extends VeiculoAutomotor {

    int quantidadeEixo;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixo) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixo = quantidadeEixo;
    }

    public int getQuantidadeEixo() {
        return quantidadeEixo;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 0.02) + (50 * getQuantidadeEixo());
    }

}
