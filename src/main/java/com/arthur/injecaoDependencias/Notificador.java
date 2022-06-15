package com.arthur.injecaoDependencias;

import org.springframework.stereotype.Component;


public interface Notificador {

    public void enviarNotificacao(Cliente cliente);
}
