package br.com.developer.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Component;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Component
public class HelloWorldAction extends ActionSupport {

    private static final long serialVersionUID = 7475177902802386554L;

    @Override
    public String execute() throws Exception {
	    return SUCCESS;
    }

}
