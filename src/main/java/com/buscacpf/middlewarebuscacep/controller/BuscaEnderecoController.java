package com.buscacpf.middlewarebuscacep.controller;


import com.buscacpf.middlewarebuscacep.model.Endereco;
import com.buscacpf.middlewarebuscacep.service.BuscarEnderecoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuscaEnderecoController {

    private final BuscarEnderecoService buscarEnderecoService;

    public BuscaEnderecoController(BuscarEnderecoService buscarEnderecoService) {
        this.buscarEnderecoService = buscarEnderecoService;
    }


    @GetMapping("/{cep}")
    public Endereco buscaEndereco(@PathVariable String cep) {
       return buscarEnderecoService.buscaEnderecoPorCepModificado(cep);

    }

}
