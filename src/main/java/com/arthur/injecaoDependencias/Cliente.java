package com.arthur.injecaoDependencias;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class Cliente {

    public String nome;
    public String cpf;
    public String email;
    public String numero;


    public boolean ativo=false;


    public Cliente(String nome, String cpf, String email, String numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.numero = numero;
    }
}
