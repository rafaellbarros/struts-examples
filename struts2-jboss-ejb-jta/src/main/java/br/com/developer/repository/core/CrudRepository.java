package br.com.developer.repository.core;

import java.util.List;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

public interface CrudRepository <T, ID> {

    public T findById(ID id);

    public List<T> findAll();

    public boolean create(T entity);

    public boolean update(T entity);

    public void deleteById(ID id);

    public void delete(T entity);

    public Long countAll();

}
