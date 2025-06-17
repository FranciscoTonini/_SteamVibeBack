package com.streamvibe.api.models.usuario;

public record DadosCadastroUsuario(
    String nome,           
    String dataNascimento, 
    String email,          
    String senha,          
    String cpf            
) {
    
}
