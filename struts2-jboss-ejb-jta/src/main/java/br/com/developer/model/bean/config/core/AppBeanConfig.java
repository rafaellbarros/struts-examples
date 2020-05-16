package br.com.developer.model.bean.config.core;

public abstract class AppBeanConfig<T, B> {

    protected T config;
    protected B builder;

    public T getConfig() {
        return this.config;
    }
}
