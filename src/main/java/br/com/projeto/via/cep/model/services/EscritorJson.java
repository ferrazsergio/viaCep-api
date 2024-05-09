package br.com.projeto.via.cep.model.services;

import br.com.projeto.via.cep.model.entities.Endereco;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class EscritorJson {
    public void salvarJson(Endereco endereco)  {

        try {
            FileWriter escrita = new FileWriter(endereco.cep() + "json");
            escrita.write(new GsonBuilder().setPrettyPrinting().create().toJson(endereco));
            escrita.close();
        } catch (IOException e) {
            throw new RuntimeException("Não foi possivel criar o arquivo cep.json");
        }
    }
}