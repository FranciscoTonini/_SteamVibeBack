package com.streamvibe.api.models.endereco;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Endereco {
    private String rua;        
    private String bairro;     
    private int cep;           
    private String cidade;     
    private String complemento;
    private int numero;        

    public Endereco(DadosCadastroEndereco dados){
        this.rua = dados.rua();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
        this.numero = dados.numero();
    }
}

