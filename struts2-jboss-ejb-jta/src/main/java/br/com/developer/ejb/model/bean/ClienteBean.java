package br.com.developer.ejb.model.bean;

import br.com.developer.ejb.model.entity.Cliente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public interface ClienteBean {

    boolean create(Cliente cliente);

    Cliente getById(Long id);

    List<Cliente> findAll();

    void update(Cliente cliente);

    void delete(Long id);
}
