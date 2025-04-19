package com.alga.servico;

import com.alga.tipo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem){
        System.out.printf("#################%nPROPOSTA SEGURO%n#################%n");
        System.out.printf("%s%n", bem.descrever());
        System.out.printf("Valor do prêmio: R$%.2f", bem.calcularValorPremio());
    }
}
