package br.com.developer.ejb.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(of = "codigo")
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private Integer idade;
    private String sexo;
    private String profissao;

}
