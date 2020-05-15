package br.com.developer.service;

import br.com.developer.model.entity.Cliente;

import java.util.List;

public interface ClienteService {

    boolean create(Cliente cliente);

    Cliente getById(Long id);

    List<Cliente> findAll();

    void update(Cliente cliente);

    void delete(Long id);
}
