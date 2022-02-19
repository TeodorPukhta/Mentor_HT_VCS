package com.pukhta;

public class Main {

    public static void main(String[] args) {
        Person kid = new Kid("Teodor","Pukhta",5);
        kid.voice();
        ((Kid) kid).eat();
        System.out.println("Meow");
    }
}
