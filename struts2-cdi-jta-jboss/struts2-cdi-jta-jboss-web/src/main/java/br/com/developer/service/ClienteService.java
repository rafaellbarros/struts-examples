package br.com.developer.service;

import br.com.developer.cdi.model.entity.Cliente;
import br.com.developer.repository.ClienteRepository;

import javax.inject.Inject;
import java.util.List;

public class ClienteService {

    @Inject
    private ClienteRepository repository;

    public List<Cliente> buscarTodos() {
        return repository.findAll();
    }
}
