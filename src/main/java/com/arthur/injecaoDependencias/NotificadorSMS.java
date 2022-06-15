package com.arthur.injecaoDependencias;


import org.springframework.stereotype.Component;

@Component
public class NotificadorSMS implements Notificador{


    @Override
    public void enviarNotificacao(Cliente cliente){
        System.out.println("Seu cadastro foi ativado !");
        System.out.println("SMS enviado para " + cliente.getNumero());
    }

}
