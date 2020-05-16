package br.com.developer.model.bean.config;

import br.com.developer.model.bean.builder.ConfigBuilder;
import br.com.developer.model.bean.remote.ClienteRemote;
import lombok.Getter;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

public class ClienteBeanConfig {

    private static final String EJB_CLIENTE_REMOTE = "ejb:/struts2-jboss-ejb-jta/ClienteBean!br.com.developer.model.bean.remote.ClienteRemote";

    @Getter
    private ClienteRemote config;

    private ConfigBuilder builder;

    public ClienteBeanConfig() {
        builder = new ConfigBuilder<ClienteRemote>(EJB_CLIENTE_REMOTE);
        config = (ClienteRemote) builder.build();
    }

}
