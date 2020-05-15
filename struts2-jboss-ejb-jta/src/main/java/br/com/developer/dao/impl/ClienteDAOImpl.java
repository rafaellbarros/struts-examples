package br.com.developer.dao.impl;

import br.com.developer.dao.ClienteDAO;
import br.com.developer.model.entity.Cliente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
public class ClienteDAOImpl implements ClienteDAO {

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
        return em.find(Cliente.class, id);
    }

    @Override
    public List<Cliente> findAll() {
        return em.createNamedQuery(Cliente.OBTER_TODOS).getResultList();
    }

    @Override
    @Transactional
    public void update(Cliente cliente) {
        em.merge(cliente);
    }

    @Override
    public void delete(Long id) {
        Cliente cliente = getById(id);
        em.remove(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        delete(cliente.getCodigo());
    }
}
