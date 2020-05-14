package br.com.developer.ejb.model.bean;

import br.com.developer.ejb.model.bean.remote.ClienteRemote;
import br.com.developer.ejb.model.entity.Cliente;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ClienteBean implements ClienteRemote {

    @Override
    public List<Cliente> findAll() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1L, "Rafael", 31,"M", "Developer"));
        return clientes;
    }
}
