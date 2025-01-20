package dev.Zerpyhis.com.Brasilprev.services;

import dev.Zerpyhis.com.Brasilprev.domain.cliente.Cliente;
import dev.Zerpyhis.com.Brasilprev.domain.cliente.DadosCliente;
import dev.Zerpyhis.com.Brasilprev.domain.cliente.RepositoryCliente;
import dev.Zerpyhis.com.Brasilprev.tratamento.TratamentoException;
import jakarta.persistence.Transient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceCliente {

    @Autowired
    RepositoryCliente repository;


    @Transient
    ResponseEntity adicionarCliente(DadosCliente dados){
        var novoCLiente = new Cliente(dados);
        repository.save(novoCLiente);
        return  ResponseEntity.accepted().body(novoCLiente);
    }

    @Transient
    ResponseEntity atualizarCliente(String id, DadosCliente dados) throws TratamentoException {
        Optional<Cliente> verificarId = repository.findById(id);

        if (verificarId.isEmpty()) {
            throw new TratamentoException("Não foi possível encontrar o usuário");
        }

        Cliente novoCliente = verificarId.get();
        if (dados.nome() != null) {
            novoCliente.setNome(dados.nome());
        }
        if (dados.cpf() != null) {
            novoCliente.setCpf(dados.cpf());
        }
        if (dados.email() != null) {
            novoCliente.setEmail(dados.email());
        }
        if (dados.telefone() != null) {
            novoCliente.setTelefone(dados.telefone());
        }
        if (dados.dataNascimento() != null) {
            novoCliente.setDataNascimento(dados.dataNascimento());
        }
        if (dados.planos() != null) {
            novoCliente.setPlanos(dados.planos());
        }
        repository.save(novoCliente);
        return ResponseEntity.ok(novoCliente);
    }

}

