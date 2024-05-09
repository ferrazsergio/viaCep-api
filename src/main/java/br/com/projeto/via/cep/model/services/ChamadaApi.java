package br.com.projeto.via.cep.model.services;

import br.com.projeto.via.cep.model.entities.Endereco;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ChamadaApi {
    public Endereco buscarEndereco(String enderecoCep) {
        String url = "https://viacep.com.br/ws/" + enderecoCep + "/json/";
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter o endereço a partir desse CEP ", e);
        }
    }
}