package com.alga.tipo;

public abstract class VeiculoAutomotor implements BemSeguravel {

    String modelo;
    double valorMercado;
    int anoFabricacao;

    public VeiculoAutomotor(String modelo, double valorMercado, int anoFabricacao) {
        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public String descrever() {
        return "Veículo '" + getModelo() + "', ano " + getAnoFabricacao() + " com valor de R$" + getValorMercado();
    }

    //carro = valor de mercado * 4% (se ano do carro <2000 adicionar mais 5% no valor final)
    //caminhao = valor de mercado * 2% e +50 reais p/ eixo

}
