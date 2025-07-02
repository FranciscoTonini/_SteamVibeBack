package com.streamvibe.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.streamvibe.api.models.filme.DadosAtualizadoFilme;
import com.streamvibe.api.models.filme.DadosCadastroFilme;
import com.streamvibe.api.models.filme.Filme;
import com.streamvibe.api.models.filme.FilmeRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/filme")
public class FilmesController {
    @Autowired
    private FilmeRepository repository;


    //CREATE
    @PostMapping
    @Transactional
    public void cadastrarFilme(@RequestBody DadosCadastroFilme dados){
        repository.save(new Filme(dados));
    }
    //READ
    @GetMapping
    public List<Filme> listarFilmes(){
        return repository.findAll();
    }
    //UPDATE
    @PutMapping
    @Transactional
    public void atualizaFilme(@RequestBody DadosAtualizadoFilme dados){
        var filme = repository.getReferenceById(dados.id());
        filme.atualizaInfo(dados);
    }
    
    //DELETE
    // @DeleteMapping("/{id}")
    // @Transactional
    // public void excluirFilmeFinal(@PathVariable Integer id){
    //     repository.deleteById(id);
    // }

    //delecao logica
    @DeleteMapping("/{id}")
    @Transactional
    public void excluirFilmeFinal(@PathVariable Integer id){
        var filme = repository.getReferenceById(id);
        filme.exclusaologica();
    }
}
