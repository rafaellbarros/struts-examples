package br.com.developer.model.bean.remote.core;


import javax.ejb.Remote;
import java.util.List;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Remote
public interface AppRemote<T, ID> {

    public T obterPorId(ID id);

    public List<T> obterTodos();

    public boolean incluir(T entity);

    public boolean alterar(T entity);

    public void excluirPorId(ID id);

    public void excluir(T entity);

    public Long contarTodos();

}
