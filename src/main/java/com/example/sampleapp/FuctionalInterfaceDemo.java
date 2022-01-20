package com.example.sampleapp;

public class FuctionalInterfaceDemo {
    public static void main(String[] args) {

        IFunctional functional = ()-> System.out.println("Inside run()");
        functional.run();
    }

    //Functional interface can have only one method otherwise compilation error comes
    @FunctionalInterface
    static interface IFunctional{
        void run();
    }
}
