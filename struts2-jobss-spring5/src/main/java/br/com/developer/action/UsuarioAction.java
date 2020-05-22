package br.com.developer.action;

import br.com.developer.service.UsuarioService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

public class UsuarioAction extends ActionSupport {

    @Setter
    @Getter
    private UsuarioService usuarioService;

    public String execute() throws Exception {

		/*
            WebApplicationContext context =
                WebApplicationContextUtils.getRequiredWebApplicationContext(ServletActionContext.getServletContext());

            UsuarioService usuarioService1 = (UsuarioService)context.getBean("usuarioService");
            usuarioService1.imprimirUsuario();
		*/

        usuarioService.imprimirUsuario();

        return SUCCESS;

    }
}
