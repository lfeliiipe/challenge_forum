package br.com.alura.forum.domain.topico;

import java.time.LocalDateTime;

public record DadosListagemTopico(Long id,
                                  String titulo,
                                  String mensagem,
                                  LocalDateTime criacao) {

    public DadosListagemTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getCriacao());
    }
}
