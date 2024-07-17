package br.com.alura.forum.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "Topico")
@Table(name = "topicos")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime criacao;

    @Column(name = "topico_ativo")
    private boolean topicoAtivo;
    private String autor;
    private String curso;

    public Topico(DadosCadastroTopico dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.criacao = LocalDateTime.now();
        this.topicoAtivo = true;
        this.autor = dados.autor();
        this.curso = dados.curso();
    }

    public void atualizarDados(DadosAtualizacaoTopico dados) {
        if(dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if(dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }
        if(dados.curso() != null) {
            this.curso = dados.curso();
        }
    }
}
