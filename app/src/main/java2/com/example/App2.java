package com.example;

public class App2 {
    public static void main(String[] args) {
        new App2().hello();
    }
    
    @Alpha("foo")
    private void hello() {
        System.out.println("hello world!");
    }
}
