package br.com.developer.dao;

import br.com.developer.model.entity.Cliente;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ClienteDAO {

    boolean create(Cliente cliente);

    Cliente getById(Long id);

    List<Cliente> findAll();

    void update(Cliente cliente);

    void delete(Long id);

    void delete(Cliente cliente);
}
