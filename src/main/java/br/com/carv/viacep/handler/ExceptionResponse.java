package br.com.carv.viacep.handler;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public record ExceptionResponse(
        @JsonProperty("Título")
        String title,
        @JsonProperty("Código de Erro")
        Integer statusCode,
        @JsonProperty("Mensagem")
        String message,
        @JsonProperty("Ocorrência em")
        LocalDateTime timestamp
) {
}
