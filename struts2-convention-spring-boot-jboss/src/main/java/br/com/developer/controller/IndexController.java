package br.com.developer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Controller
public class IndexController {
    @GetMapping("/core/")
    public String index() {
        return "redirect:/core/hello-world.action";
    }
}
