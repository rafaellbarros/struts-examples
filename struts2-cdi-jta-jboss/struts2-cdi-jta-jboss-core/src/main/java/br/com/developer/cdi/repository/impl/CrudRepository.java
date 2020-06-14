package br.com.developer.cdi.repository.impl;

import br.com.developer.cdi.repository.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class CrudRepository<T, PK extends Serializable> implements Repository<T, PK> {

    private final Class<T> clazz;

    @PersistenceContext(unitName="projetoJbossPU")
    EntityManager em;

    public CrudRepository() {
        clazz = (Class<T>) ((ParameterizedType) this
                .getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public List<T> findAll() {
        return (List<T>) em.createQuery("from " + clazz.getName()).getResultList();
    }
}
