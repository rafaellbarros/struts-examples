package br.com.developer.cdi.dev.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
@ToString
public class Game implements Serializable {

    @Getter
    @Setter
    private String name;
}
