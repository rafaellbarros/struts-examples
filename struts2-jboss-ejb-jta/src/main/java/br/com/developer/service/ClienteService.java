package br.com.developer.service;

import br.com.developer.model.entity.Cliente;
import br.com.developer.repository.ClienteRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Stateless
public class ClienteService {

    @Inject
    private ClienteRepository repository;

    public Cliente obterPorId(Long id) {
        return repository.findById(id);
    }

    public List<Cliente> obterTodos() {
        return repository.findAll();
    }

    @Transactional
    public boolean incluir(Cliente cliente) {
        return repository.create(cliente);
    }

    @Transactional
    public boolean alterar(Cliente cliente) {
        return repository.update(cliente);
    }

    @Transactional
    public void excluirPorId(Long id) {
        repository.deleteById(id);
    }

    @Transactional
    public void excluir(Cliente cliente) {
        repository.delete(cliente);
    }

    public Long contarTodos() {
        return repository.countAll();
    }
}
