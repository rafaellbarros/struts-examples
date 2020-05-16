package br.com.developer.model.bean.config.core;

import br.com.developer.model.bean.remote.core.LookupDefault;
import lombok.Getter;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Getter
public class ConfigBean<T> implements LookupDefault<T> {

    private String ebjName;

    final private T lookupDefaultBean;

    public ConfigBean(String ebjName) {
        this.ebjName = ebjName;
        this.lookupDefaultBean = lookupDefaultBean(this.ebjName);
    }

}
