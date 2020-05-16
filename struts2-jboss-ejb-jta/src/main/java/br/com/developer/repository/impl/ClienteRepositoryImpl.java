package br.com.developer.repository.impl;

import br.com.developer.model.entity.Cliente;
import br.com.developer.repository.ClienteRepository;
import br.com.developer.repository.core.impl.CrudRepositoryImpl;

import javax.ejb.Stateless;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Stateless
public class ClienteRepositoryImpl extends CrudRepositoryImpl<Cliente, Long> implements ClienteRepository {

}
