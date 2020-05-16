package br.com.developer.model.bean.config;

import br.com.developer.model.bean.remote.LookupDefault;
import lombok.Getter;

@Getter
public class ConfigBean<T> implements LookupDefault<T> {

    private String ebjName;

    final private T lookupDefaultBean;

    public ConfigBean(String ebjName) {
        this.ebjName = ebjName;
        this.lookupDefaultBean = lookupDefaultBean(this.ebjName);
    }

}
