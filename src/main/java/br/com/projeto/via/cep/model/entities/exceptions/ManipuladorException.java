package br.com.projeto.via.cep.model.entities.exceptions;

public class ManipuladorException {
    public void excecaoCepInvalido(CepInvalidoException e) {
        System.out.println(e.getMessage());
    }

    public void excecaoGenerica(Exception e) {
        System.out.println("Ocorreu um erro: " + e.getMessage());
    }
}