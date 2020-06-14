package br.com.developer.action;

import br.com.developer.cdi.model.entity.Cliente;
import br.com.developer.model.Game;
import br.com.developer.service.ClienteService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;

import javax.inject.Inject;
import java.util.List;

public class GameAction extends ActionSupport {

    @Inject
    Game game;

    @Inject
    ClienteService service;

    @Getter
    private List<Cliente> clientes;

    public GameAction() {
        // System.out.println("******* " + game.hello() + " *******") ;
        System.out.println("******* Init  GameAction *******");
    }

    @Override
    public String execute() throws Exception {
        game.setName("Mortal XI");
        System.out.println(game.toString());

        this.clientes = service.buscarTodos();

        return SUCCESS;
    }
}
