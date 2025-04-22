package com.alga;

import com.alga.servico.ServicoPropostaSeguro;
import com.alga.tipo.BemSeguravel;
import com.alga.tipo.Caminhao;
import com.alga.tipo.CarroParticular;
import com.alga.tipo.ImovelResidencial;

public class Main {

    public static void main(String[] args) {
        BemSeguravel casa = new ImovelResidencial(2_300_000, 320);
        var caminhao = new Caminhao("Scania", 780_000, 2025, 4);
        var carro = new CarroParticular("UP", 150_000, 2022);

        var servico = new ServicoPropostaSeguro();

        servico.emitir(carro);
        servico.emitir(caminhao);
        servico.emitir(casa);

    }
}
