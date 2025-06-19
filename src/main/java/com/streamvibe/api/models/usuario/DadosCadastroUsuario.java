package com.streamvibe.api.models.usuario;

import com.streamvibe.api.models.endereco.DadosCadastroEndereco;

public record DadosCadastroUsuario(
    String nome,           
    String dataNascimento, 
    String email,          
    String senha,          
    String cpf,
    DadosCadastroEndereco endereco            
) {
    
}
