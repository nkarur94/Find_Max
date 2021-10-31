package com.assignment13;

public class GenericDemo {
    public static void main(String[] args) {
        Generics <Integer> findMax=new Generics<>(33, -55, 24);
        Generics <Float> findMaxF=new Generics<>(3.3F, 4.5F, -3.2F);

        findMax.maximumOfNum();
        findMaxF.maximumOfNum();


    }
}
