package br.com.developer.repository.core.impl;

import br.com.developer.repository.core.CrudRepository;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

public abstract class CrudRepositoryImpl<T, ID> implements CrudRepository<T, ID> {

    private transient final Class<T> clazz;

    @Inject
    public CrudRepositoryImpl() {
        clazz = (Class<T>) ((ParameterizedType) this
             .getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @PersistenceContext(unitName="projetoJbossPU")
    protected transient EntityManager em;

    @Override
    public T findById(ID id) {
        return em.find(clazz, id);
    }

    @Override
    public List<T> findAll() {
        TypedQuery<T> query = em.createQuery("from " + clazz.getName(), clazz);
        List<T> resultList = query.getResultList();
        return resultList;
    }

    @Override
    @Transactional
    public boolean create(T entity) {
        em.persist(entity);
        return true;
    }

    @Override
    @Transactional
    public boolean update(T entity) {
        em.merge(entity);
        return true;
    }

    @Override
    @Transactional
    public void deleteById(ID id) {
        T t = findById(id);
        em.remove(t);
    }

    @Override
    @Transactional
    public void delete(T entity) {
        em.remove(entity);
    }

    @Override
    public Long countAll() {
     return (Long) em.createQuery("SELECT COUNT (t) FROM " + clazz.getName() + " t").getSingleResult();
    }
}
