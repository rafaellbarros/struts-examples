package br.com.developer.action;

import br.com.developer.ejb.model.bean.config.ClienteBeanConfig;
import br.com.developer.ejb.model.bean.remote.ClienteRemote;
import br.com.developer.ejb.model.entity.Cliente;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClienteAction extends ActionSupport {

    private static final String EJB_CLIENTE = "ejb:/struts2-jboss-ejb-jta/ClienteBean!br.com.developer.ejb.model.bean.remote.ClienteRemote";

    private ClienteRemote clienteRemote = new ClienteBeanConfig().lookupDefaultBean(EJB_CLIENTE);

    String titulo;

    private List<Cliente> clientes;

    @Override
    public String execute() throws Exception {
       setTitulo("Clientes");

        List<Cliente> clientes = clienteRemote.findAll();

        setClientes(clientes);

        return SUCCESS;
    }

}
