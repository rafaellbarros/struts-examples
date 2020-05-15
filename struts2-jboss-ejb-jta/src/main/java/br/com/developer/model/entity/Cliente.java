package br.com.developer.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode(of = "codigo")
@Table(name="cliente")
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(
                name = Cliente.OBTER_TODOS,
                query = "SELECT c FROM Cliente c"
        )
})
public class Cliente implements Serializable {

    public static final String OBTER_TODOS = "Cliente.obterTodos";

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private Integer idade;
    private String sexo;
    private String profissao;

}
