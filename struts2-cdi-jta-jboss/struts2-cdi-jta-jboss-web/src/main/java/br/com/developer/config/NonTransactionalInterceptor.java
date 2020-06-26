package br.com.developer.config;

import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@SampleBinding(transaction = false)
@Interceptor
public class NonTransactionalInterceptor {

    @AroundConstruct
    public Object construct(InvocationContext context) throws Exception {
        System.out.println("NonTransactionalInterceptor > construct");
        return context.proceed();
    }

    @AroundInvoke
    public Object invoke(InvocationContext context) throws Exception {
        System.out.println("NonTransactionalInterceptor > invoke");
        return context.proceed();
    }

}