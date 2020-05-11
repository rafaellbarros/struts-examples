package br.com.developer.cdi.dev.action;

import br.com.developer.cdi.dev.model.Game;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import javax.inject.Inject;

@Log4j2
@Getter
public class GameAction extends ActionSupport {

    @Inject
    Game game;

    public GameAction() {
        // System.out.println("******* " + game.hello() + " *******") ;
       log.info("******* Init  GameAction *******"); ;
    }

    @Override
    public String execute() throws Exception {
        game.setName("Mortal XI");
        System.out.println(game.toString());
        return SUCCESS;
    }
}
