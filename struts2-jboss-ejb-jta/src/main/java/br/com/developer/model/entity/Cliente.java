package br.com.developer.model.entity;

import br.com.developer.model.entity.core.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@ToString
@Getter
@Setter
@Entity
@Table(name="cliente", schema = "cadastro_cliente")
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(
                name = Cliente.OBTER_TODOS,
                query = "SELECT c FROM Cliente c"
        )
})
public class Cliente extends BaseEntity<Long> {

    private static final long serialVersionUID = 1L;

    public static final String OBTER_TODOS = "Cliente.obterTodos";

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "codigo", unique = true, nullable = false)
    private Long id;

    private String nome;
    private Integer idade;
    private String sexo;
    private String profissao;

}
