package br.com.developer.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Component
@Namespace("/core")
public class HelloWorldAction extends ActionSupport {

    private static final long serialVersionUID = 7475177902802386554L;

    @Override
    @Action(value = "hello-world", results = {
            @Result(name = "success", location = "/views/hello-world.jsp")
    })
    public String execute() throws Exception {
	    return SUCCESS;
    }

}
