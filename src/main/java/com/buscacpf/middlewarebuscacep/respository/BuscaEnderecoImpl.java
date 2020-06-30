package com.buscacpf.middlewarebuscacep.respository;

import com.buscacpf.middlewarebuscacep.model.Endereco;
import org.springframework.stereotype.Repository;

@Repository
public class BuscaEnderecoImpl  implements BuscarEnderecoRepository{

    @Override
    public Endereco buscaEnderecoPorCep(String cep) {
        Endereco endereco = new Endereco("Praça da Sé",
                "lado ímpar",
                "Sé",
                "São Paulo",
                "SP",
                "",
                "3550308",
                "1004", "01001-000");
        return endereco;
    }
}
