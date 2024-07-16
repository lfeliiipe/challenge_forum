package br.com.alura.forum.controller;

import br.com.alura.forum.topico.DadosCadastroTopico;
import br.com.alura.forum.topico.DadosListagemTopico;
import br.com.alura.forum.topico.Topico;
import br.com.alura.forum.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@Valid @RequestBody DadosCadastroTopico dados) {
        var topico = new Topico(dados);
        repository.save(topico);
        return ResponseEntity.ok().body(topico);
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemTopico>> listar(
            @PageableDefault(size = 10, sort = {"criacao"})
            Pageable paginacao,
            @RequestParam(value = "order", defaultValue = "ASC") String order) {
        var page = repository.findAllByTopicoAtivoTrue(paginacao).map(DadosListagemTopico::new);
        return ResponseEntity.ok(page);
    }


}
