package com.streamvibe.api.models.endereco;

public record DadosCadastroEndereco(
    String rua,        
    String bairro,     
    int cep,           
    String cidade,     
    String complemento,
    int numero        
) {
    
}
