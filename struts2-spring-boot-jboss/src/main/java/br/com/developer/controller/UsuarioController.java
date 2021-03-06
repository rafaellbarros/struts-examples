package br.com.developer.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @GetMapping(value = "/usuarios",
            produces = { APPLICATION_JSON_VALUE })
    public List<Usuario> obterUsuarios() {
       return Arrays.asList(new Usuario(1L, "Rafael"), new Usuario(2L, "Xablau"));
    }

    @Getter
    @AllArgsConstructor
    public class Usuario {
        private Long id;
        private String nome;
    }
}
