package com.buscacpf.middlewarebuscacep.respository;

import com.buscacpf.middlewarebuscacep.model.Endereco;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


@Repository
public class BuscaEnderecoRestImpl implements BuscarEnderecoRepository{

    @Override
    public Endereco buscaEnderecoPorCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String urlCep  = "https://viacep.com.br/ws/"+ cep +"/json/";
        Endereco response = restTemplate.getForObject(urlCep,Endereco.class);
        return response;
    }
}
