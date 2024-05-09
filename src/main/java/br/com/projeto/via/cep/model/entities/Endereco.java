package br.com.projeto.via.cep.model.entities;

public record Endereco(String cep,
                       String logradouro,
                       String complemento,
                       String bairro,
                       String localidade,
                       String uf) {
}

