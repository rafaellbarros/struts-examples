package br.com.developer.model.bean.builder;

import br.com.developer.model.bean.config.ConfigBean;

public class ConfigBuilder<T> {

    private String ejbName;

    public ConfigBuilder(String ejbName) {
        this.ejbName = ejbName;
    }

    public T build() {
        ConfigBean configBean = new ConfigBean<T>(this.ejbName);
        return (T) configBean.getLookupDefaultBean();
    }
}
