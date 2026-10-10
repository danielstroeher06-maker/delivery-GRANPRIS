package com.vinicola.deliveryvinicola.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(VinhoNaoEncontrado.class)
    public String handlerVinhoNaoEncontrado(VinhoNaoEncontrado vinhoNaoEncontrado){
        return vinhoNaoEncontrado.getMessage();
    }

    @ExceptionHandler(QuantidadeInvalida.class)
    public String handlerQuantidadeInvalida(QuantidadeInvalida quantidadeInvalida){
        return quantidadeInvalida.getMessage();
    }
}
