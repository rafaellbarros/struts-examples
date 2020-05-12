package br.com.developer.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;


@Data
@Entity
@EqualsAndHashCode(of = "codigo")
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private Integer idade;
    private String sexo;
    private String profissao;
}
