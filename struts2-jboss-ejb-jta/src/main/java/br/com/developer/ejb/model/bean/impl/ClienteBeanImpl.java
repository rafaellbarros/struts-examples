package br.com.developer.ejb.model.bean.impl;

import br.com.developer.ejb.model.bean.ClienteBean;
import br.com.developer.ejb.model.entity.Cliente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
public class ClienteBeanImpl implements ClienteBean {

    @PersistenceContext(unitName="projetoJbossPU")
    private EntityManager em;

    @Override
    @Transactional
    public boolean create(Cliente cliente) {
        em.persist(cliente);
        return true;
    }

    @Override
    public Cliente getById(Long id) {
        Query query = em.createQuery("SELECT c FROM Cliente c WHERE c.id = :ID");
        query.setParameter("ID", id);
        Cliente cliente = (Cliente) query.getSingleResult();
        return cliente;
    }

    @Override
    public List<Cliente> findAll() {
        Query query = em.createQuery("SELECT e FROM Cliente e");
        List<Cliente> clientes = query.getResultList();
        return clientes;
    }

    @Override
    @Transactional
    public void update(Cliente cliente) {
        em.merge(cliente);
    }

    @Override
    public void delete(Long id) {
        Query query = em.createQuery("DELETE FROM Cliente c WHERE c.id = :ID");
        query.setParameter("ID", id);
        query.executeUpdate();
    }
}
