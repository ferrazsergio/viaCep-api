package br.com.projeto.via.cep.model.services;

import br.com.projeto.via.cep.model.exceptions.CepInvalidoException;

import java.util.Scanner;

public class ManipuladorEntrada {
    public String obterEntradaCep() throws CepInvalidoException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o CEP desejado com 8 caracteres sem pontos ou traço: ");
        String enderecoCep = sc.nextLine();
        if (enderecoCep.length() != 8) {
            throw new CepInvalidoException("Favor digitar CEP de acordo com os requisitos!");
        }
        return enderecoCep;
    }
}