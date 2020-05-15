package br.com.developer.model.bean.remote;

import br.com.developer.model.entity.Cliente;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface ClienteRemote {

    boolean create(Cliente cliente);

    Cliente getById(Long id);

    List<Cliente> findAll();

    void update(Cliente cliente);

    void delete(Long id);

}
