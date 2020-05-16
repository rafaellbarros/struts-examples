package br.com.developer.model.bean;

import br.com.developer.model.bean.remote.ClienteRemote;
import br.com.developer.model.entity.Cliente;
import br.com.developer.service.ClienteService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Stateless
public class ClienteBean implements ClienteRemote {

    @Inject
    private ClienteService service;

    @Override
    public Cliente obterPorId(Long id) {
        return service.obterPorId(id);
    }

    @Override
    public List<Cliente> obterTodos() {
        return service.obterTodos();
    }

    @Override
    public boolean incluir(Cliente cliente) {
        return service.incluir(cliente);
    }

    @Override
    public boolean alterar(Cliente cliente) {
        return service.alterar(cliente);
    }

    @Override
    public void excluirPorId(Long id) {
        service.excluirPorId(id);
    }

    @Override
    public void excluir(Cliente entity) {
        service.excluir(entity);
    }

    @Override
    public Long contarTodos() {
        return service.contarTodos();
    }

}
