package com.streamvibe.api.models.endereco;

public record DadosCadastroEndereco(
    String rua,        
    String bairro,     
    String cep,           
    String cidade,     
    String complemento,
    String numero        
) {
    
}
