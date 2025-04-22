package com.alga.tipo;

public class CarroParticular extends VeiculoAutomotor{

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double valorFinal = getValorMercado() * 0.04;
        if (getAnoFabricacao() >= 2000) {
            return valorFinal;
        }else{
            return valorFinal + (valorFinal * 0.05);
        }
    }
}
