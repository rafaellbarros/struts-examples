package br.com.developer.action;

import br.com.developer.model.bean.config.ClienteBeanConfig;
import br.com.developer.model.bean.remote.ClienteRemote;
import br.com.developer.model.entity.Cliente;
import br.com.developer.util.LogUtil;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Getter
@Setter
public class ClienteAction extends ActionSupport {

    private ClienteRemote clienteRemote;

    String titulo;

    private List<Cliente> clientes;

    public ClienteAction() {
        LogUtil.info("Init ClienteAction");
        clienteRemote = new ClienteBeanConfig().getConfig();
    }

    @Override
    public String execute() throws Exception {
       setTitulo("Clientes");

        // TODO: Create enum Sexo
        Cliente c = new Cliente();
        c.setNome("Rafael Barros");
        c.setIdade(32);
        c.setSexo("M");
        c.setProfissao("Developer");

        // final boolean incluir = clienteRemote.incluir(c);

        final Cliente cliente = clienteRemote.obterPorId(1L);

        System.out.println("Total => " + clienteRemote.contarTodos());

        System.out.println(cliente);

        List<Cliente> clientes = clienteRemote.obterTodos();

        setClientes(clientes);

        return SUCCESS;
    }
}
