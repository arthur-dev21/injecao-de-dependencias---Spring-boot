package com.arthur.injecaoDependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Servidor {

    @Autowired
    private Processador processador = new Processador();



    public void executar(Cliente cliente){
        processador.processar(cliente);
    }
}
