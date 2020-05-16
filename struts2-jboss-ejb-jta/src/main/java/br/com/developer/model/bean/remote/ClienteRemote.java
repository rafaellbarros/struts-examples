package br.com.developer.model.bean.remote;

import br.com.developer.model.bean.remote.core.AppRemote;
import br.com.developer.model.entity.Cliente;

import javax.ejb.Remote;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Remote
public interface ClienteRemote extends AppRemote<Cliente, Long> {

}
