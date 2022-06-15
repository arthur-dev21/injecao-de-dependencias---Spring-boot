package com.arthur.injecaoDependencias;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class NotificadorEmail implements Notificador{



    @Override
    public void enviarNotificacao(Cliente cliente){
        System.out.println("Seu cadastro foi ativado !");
        System.out.println("Email enviado para " + cliente.getEmail());


    }
}
