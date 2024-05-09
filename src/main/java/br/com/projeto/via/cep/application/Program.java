package br.com.projeto.via.cep.application;

import br.com.projeto.via.cep.model.exceptions.CepInvalidoException;
import br.com.projeto.via.cep.model.exceptions.ManipuladorException;
import br.com.projeto.via.cep.model.entities.Endereco;
import br.com.projeto.via.cep.model.services.ChamadaApi;
import br.com.projeto.via.cep.model.services.EscritorJson;
import br.com.projeto.via.cep.model.services.ManipuladorEntrada;

public class Program {
    public static void main(String[] args) {
        ManipuladorException manipuladorExcecao = new ManipuladorException();
        ManipuladorEntrada manipuladorEntrada = new ManipuladorEntrada();

        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                String enderecoCep = manipuladorEntrada.obterEntradaCep();

                entradaValida = true;

                ChamadaApi chamadaApi = new ChamadaApi();
                Endereco endereco = chamadaApi.buscarEndereco(enderecoCep);

                EscritorJson escritorJson = new EscritorJson();
                escritorJson.salvarJson(endereco);

                System.out.println("O programa finalizou corretamente!");
            } catch (CepInvalidoException e) {
                manipuladorExcecao.excecaoCepInvalido(e);
            } catch (Exception e) {
                manipuladorExcecao.excecaoGenerica(e);
            }
        }
    }
}
