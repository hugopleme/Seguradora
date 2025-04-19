package com.alga;

import com.alga.servico.ServicoPropostaSeguro;
import com.alga.tipo.BemSeguravel;
import com.alga.tipo.ImovelResidencial;

public class Main {

    public static void main(String[] args) {
        BemSeguravel casa = new ImovelResidencial(2_300_000, 320);
        var servico = new ServicoPropostaSeguro();

        servico.emitir(casa);

    }
}
