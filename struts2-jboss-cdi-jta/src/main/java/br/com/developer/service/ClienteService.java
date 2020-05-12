package br.com.developer.service;

import br.com.developer.model.entity.Cliente;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ClienteService implements Serializable {

    @PersistenceContext(unitName="projetoJbossPU")
    EntityManager em;

    @Transactional
    public void salvar(Cliente cliente) {
        em.persist(cliente);
        System.out.println("Cliente salvo com sucesso!");
    }

    @SuppressWarnings("unchecked")
    public List<Cliente> buscarTodos() {
        Query query = em.createQuery("SELECT c FROM Cliente c");
        List<Cliente> clientes = query.getResultList();
        System.out.println("buscarTodos Clientes com sucesso!");
        return clientes;
    }
}
