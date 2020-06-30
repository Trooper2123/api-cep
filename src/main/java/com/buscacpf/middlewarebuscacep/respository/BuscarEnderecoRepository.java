package com.buscacpf.middlewarebuscacep.respository;

import com.buscacpf.middlewarebuscacep.model.Endereco;
import org.springframework.stereotype.Repository;

@Repository
public interface BuscarEnderecoRepository {

    Endereco buscaEnderecoPorCep (String cep);
}
