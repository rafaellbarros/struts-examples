package br.com.developer.action;

import br.com.developer.ejb.model.bean.remote.ClienteRemote;
import br.com.developer.ejb.model.entity.Cliente;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Getter
@Setter
public class ClienteAction extends ActionSupport {

    private static final String EJB_CLIENTE = "ejb:/struts2-jboss-ejb-jta/ClienteBean!br.com.developer.ejb.model.bean.remote.ClienteRemote";

    private ClienteRemote clienteRemote = lookupClienteBean();

    String titulo;

    private List<Cliente> clientes;

    @Override
    public String execute() throws Exception {
       setTitulo("Mortal XI");

        List<Cliente> clientes = clienteRemote.findAll();

        setClientes(clientes);

        return SUCCESS;
    }


    public ClienteRemote lookupClienteBean() {
        try {
            InitialContext ic = new InitialContext();
            return (ClienteRemote) ic.lookup(EJB_CLIENTE);
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
