package br.com.developer.repository.impl;

import br.com.developer.cdi.model.entity.Cliente;
import br.com.developer.cdi.repository.impl.CrudRepository;
import br.com.developer.repository.ClienteRepository;

public class ClienteRepositoryImpl extends CrudRepository<Cliente, Long> implements ClienteRepository {

}
