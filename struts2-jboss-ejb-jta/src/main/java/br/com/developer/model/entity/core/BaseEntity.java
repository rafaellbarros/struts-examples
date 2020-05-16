package br.com.developer.model.entity.core;

import java.io.Serializable;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

public abstract class BaseEntity<T extends Serializable> implements Serializable {

    private static final long serialVersionUID = 1L;

    public BaseEntity() {
    }

    public abstract T getId();

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof BaseEntity)) {
            return false;
        } else {
            BaseEntity<?> that = (BaseEntity)o;
            return this.getId() != null ? this.getId().equals(that.getId()) : that.getId() == null;
        }
    }

    public int hashCode() {
        return this.getId() != null ? this.getId().hashCode() : 0;
    }

    public String toString() {
        String entidade = this.getClass().getSimpleName();
        return "Entidade [ " + entidade + " ] {id=" + this.getId() + '}';
    }
}
