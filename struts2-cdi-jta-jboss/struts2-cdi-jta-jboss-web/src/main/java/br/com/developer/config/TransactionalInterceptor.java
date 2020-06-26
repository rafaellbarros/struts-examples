package br.com.developer.config;

import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@SampleBinding(transaction = true)
@Interceptor
public class TransactionalInterceptor {

    @AroundConstruct
    public Object construct(InvocationContext context) throws Exception {
        System.out.println("TransactionalInterceptor > construct");
        return context.proceed();
    }

    @AroundInvoke
    public Object invoke(InvocationContext context) throws Exception {
        System.out.println("TransactionalInterceptor > invoke");
        return context.proceed();
    }

}