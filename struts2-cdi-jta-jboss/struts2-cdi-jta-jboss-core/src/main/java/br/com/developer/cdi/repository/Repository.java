package br.com.developer.cdi.repository;

import java.io.Serializable;
import java.util.List;

public interface Repository<T, PK extends Serializable> {
    public List<T> findAll();
}
