package br.com.developer.service.impl;

import br.com.developer.dao.ClienteDAO;
import br.com.developer.model.entity.Cliente;
import br.com.developer.service.ClienteService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ClienteServiceImpl implements ClienteService {

    @Inject
    private ClienteDAO dao;

    @Override
    public boolean create(Cliente cliente) {
        return dao.create(cliente);
    }

    @Override
    public Cliente getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public List<Cliente> findAll() {
        return dao.findAll();
    }

    @Override
    public void update(Cliente cliente) {
        dao.update(cliente);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public void delete(Cliente cliente) {
        dao.delete(cliente);
    }
}
