package com.pukhta;

public class Kid extends Person {
    public Kid(String name, String surname, int age) {
        super(name, surname, age);
    }

    public void eat(){
        System.out.println("eat");
    }

    @Override
    void voice() {
        System.out.println("Hello, my name is " + super.name);
    }
}
