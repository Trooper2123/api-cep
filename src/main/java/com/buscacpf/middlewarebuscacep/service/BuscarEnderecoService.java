package com.buscacpf.middlewarebuscacep.service;

import com.buscacpf.middlewarebuscacep.model.Endereco;
import com.buscacpf.middlewarebuscacep.respository.BuscarEnderecoRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BuscarEnderecoService {


    private final BuscarEnderecoRepository buscarEnderecoRepository;

    public BuscarEnderecoService(@Qualifier("buscaEnderecoRestImpl") BuscarEnderecoRepository buscarEnderecoRepository) {
        this.buscarEnderecoRepository = buscarEnderecoRepository;
    }

    public Endereco buscaEnderecoPorCepModificado(String cep){
        Endereco endereco = buscarEnderecoRepository.buscaEnderecoPorCep(cep);
        endereco.setCep(endereco.getCep().replace("-",""));
        return endereco;
    }


}
