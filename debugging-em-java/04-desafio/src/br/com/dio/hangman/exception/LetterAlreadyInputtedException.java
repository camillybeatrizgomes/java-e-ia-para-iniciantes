package br.com.dio.hangman.exception;

public class LetterAlreadyInputtedException extends RuntimeException {

    public LetterAlreadyInputtedException(final String message){
        super(message);
    }
}
