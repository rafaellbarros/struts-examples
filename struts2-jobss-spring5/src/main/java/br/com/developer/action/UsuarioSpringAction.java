package br.com.developer.action;

import br.com.developer.service.UsuarioService;
import lombok.Getter;
import lombok.Setter;

public class UsuarioSpringAction {

    @Setter
    @Getter
    private UsuarioService usuarioService;

    public String execute() throws Exception {

        usuarioService.imprimirUsuario();

        return "success";
    }
}
