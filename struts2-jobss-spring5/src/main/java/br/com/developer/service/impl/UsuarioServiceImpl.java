package br.com.developer.service.impl;

import br.com.developer.model.Usuario;
import br.com.developer.service.UsuarioService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

public class UsuarioServiceImpl implements UsuarioService {

    @Getter
    @Setter
    private Usuario usuario;

    @Override
    public void imprimirUsuario() {
        usuario.setUsername("Xablau");
        System.out.println("[INFO]: " + usuario.toString());
    }


}
