package br.com.developer.model.bean.config;

import br.com.developer.model.bean.builder.ConfigBuilder;
import br.com.developer.model.bean.config.core.AppBeanConfig;
import br.com.developer.model.bean.remote.ClienteRemote;
import lombok.Getter;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

public class ClienteBeanConfig extends AppBeanConfig<ClienteRemote, ConfigBuilder> {

    private static final String EJB_CLIENTE_REMOTE = "ejb:/struts2-jboss-ejb-jta/ClienteBean!br.com.developer.model.bean.remote.ClienteRemote";

    public ClienteBeanConfig() {
        this.builder = new ConfigBuilder<ClienteRemote>(EJB_CLIENTE_REMOTE);
        this.config = (ClienteRemote) this.builder.build();
    }
}
