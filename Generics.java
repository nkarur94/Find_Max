package com.assignment13;

public class Generics <T extends Comparable<T>>{
    T a;
    T b;
    T c;

    Generics(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void maximumOfNum() {

        if (a.compareTo(b) >0) {
            if (a.compareTo(c)>0){
                System.out.println("a is greater");
            }else{
                System.out.println("c is greater");
            }
        }
        else if(b.compareTo(c)>0){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }

}
