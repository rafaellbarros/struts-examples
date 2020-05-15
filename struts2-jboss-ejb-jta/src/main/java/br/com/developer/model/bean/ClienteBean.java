package br.com.developer.model.bean;

import br.com.developer.model.bean.remote.ClienteRemote;
import br.com.developer.model.entity.Cliente;
import br.com.developer.service.ClienteService;
import br.com.developer.service.impl.ClienteServiceImpl;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ClienteBean implements ClienteRemote {

    @Inject
    private ClienteService service;

    @Override
    public boolean create(Cliente cliente) {
        return service.create(cliente);
    }

    @Override
    public Cliente getById(Long id) {
        return service.getById(id);
    }

    @Override
    public List<Cliente> findAll() {
        return service.findAll();
    }

    @Override
    public void update(Cliente cliente) {
        service.update(cliente);
    }

    @Override
    public void delete(Long id) {
        service.delete(id);
    }
}
