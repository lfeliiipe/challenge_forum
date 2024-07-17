package br.com.alura.forum.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoTopico(String titulo,
                                     String mensagem,
                                     String curso) {
}