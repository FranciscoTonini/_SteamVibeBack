package com.streamvibe.api.models.usuario;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private int id;
    private String nome;           
    private String dataNascimento; 
    private String email;          
    private String senha;          
    private String cpf;            

    public Usuario(DadosCadastroUsuario dados){
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();
        this.email = dados.email();
        this.senha = dados.senha();
        this.cpf = dados.cpf();
    }
}
