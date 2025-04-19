package com.alga.tipo;

public class ImovelResidencial implements BemSeguravel {

    double valorMercado;
    int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 0.001) + (0.3 * getAreaConstruida());
    }

    @Override
    public String descrever() {
        return "Imóvel Residencial no valor de R$" + getValorMercado() + ", com " + getAreaConstruida()
                + "m2";
    }
}
