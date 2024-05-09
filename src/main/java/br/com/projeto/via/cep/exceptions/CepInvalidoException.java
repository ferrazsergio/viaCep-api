package br.com.projeto.via.cep.exceptions;

public class CepInvalidoException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public CepInvalidoException(String msg) {
        super(msg);
    }
}
