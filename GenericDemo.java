package com.assignment13;

public class GenericDemo {
    public static void main(String[] args) {
        Generics <Integer> findMax=new Generics<>(33, -55, 24);
        findMax.maximumOfNum();
    }
}
