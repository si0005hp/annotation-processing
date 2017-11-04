package com.example;

public class App {
    public static void main(String[] args) {
        new App().hello();
    }
    
    @Alpha("foo")
    private void hello() {
        System.out.println("hello world!");
    }
}
