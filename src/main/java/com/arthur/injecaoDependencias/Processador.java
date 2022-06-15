package com.arthur.injecaoDependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Processador {

    @Autowired
    Notificador notificador = new NotificadorEmail();



    public void processar(Cliente cliente){
        cliente.setAtivo(true);
        System.out.println("cliente ativado !");
        System.out.printf("cliente : %s \n envio: %s \n" , cliente.getNome(),cliente.getCpf());
        notificador.enviarNotificacao(cliente);
    }
}
