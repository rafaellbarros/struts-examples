package br.com.developer.config;

public class SampleBean {

    @SampleBinding(transaction = true)
    public void test() {
        System.out.println("SampleBean > test");
    }

}
