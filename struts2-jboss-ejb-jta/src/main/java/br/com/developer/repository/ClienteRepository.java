package br.com.developer.repository;


import br.com.developer.model.entity.Cliente;
import br.com.developer.repository.core.CrudRepository;

import javax.ejb.Local;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Local
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
