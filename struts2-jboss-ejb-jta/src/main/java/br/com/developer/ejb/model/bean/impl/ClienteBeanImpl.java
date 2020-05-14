package br.com.developer.ejb.model.bean.impl;

import java.io.Serializable;

public class ClienteBeanImpl implements Serializable {

    /*

    @PersistenceContext(unitName="projetoJbossPU")
    private EntityManager em;

    @Transactional
    public boolean create(Cliente cliente) {
        em.persist(cliente);
        return true;
    }


    public Cliente getById(Long id) {
        Query query = em.createQuery("SELECT c FROM Cliente c WHERE c.id = :ID");
        query.setParameter("ID", id);
        Cliente cliente = (Cliente) query.getSingleResult();
        return cliente;
    }


    public List<Cliente> findAll() {
        Query query = em.createQuery("SELECT e FROM Cliente e");
        List<Cliente> clientes = query.getResultList();
        return clientes;
    }


    @Transactional
    public void update(Cliente cliente) {
        em.merge(cliente);
    }

    public void delete(Long id) {
        Query query = em.createQuery("DELETE FROM Cliente c WHERE c.id = :ID");
        query.setParameter("ID", id);
        query.executeUpdate();
    }

    */

}
