package br.com.alura.forum.topico;

import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(String titulo,
                                      String mensagem,
                                      LocalDateTime criacao,
                                      @JsonAlias("topico_ativo") Boolean topicoAtivo,
                                      String autor,
                                      String curso) {

    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensagem(), topico.getCriacao(), topico.isTopicoAtivo(),
                topico.getAutor(), topico.getCurso());
    }
}
