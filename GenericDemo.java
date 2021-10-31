package com.assignment13;

public class GenericDemo {
    public static void main(String[] args) {
        Generics <Integer> findMax=new Generics<>(33, 12, 24);
        Generics <Float> findMaxF=new Generics<>(3.3F, 4.5F, -3.2F);
        Generics<String> findMaxS=new Generics<>("rk", "zk", "nrk");
        findMax.maximumOfNum();
        findMaxF.maximumOfNum();
        findMaxS.maximumOfNum();
_

    }
}
