package br.com.developer.action;

import br.com.developer.model.bean.builder.ConfigBuilder;
import br.com.developer.model.bean.config.ClienteBeanConfig;
import br.com.developer.model.bean.remote.ClienteRemote;
import br.com.developer.model.entity.Cliente;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClienteAction extends ActionSupport {

    private ClienteRemote clienteRemote;

    String titulo;

    private List<Cliente> clientes;

    public ClienteAction() {
         clienteRemote = new ClienteBeanConfig().getConfig();
    }

    @Override
    public String execute() throws Exception {
       setTitulo("Clientes");

        List<Cliente> clientes = clienteRemote.findAll();

        setClientes(clientes);

        return SUCCESS;
    }

}
