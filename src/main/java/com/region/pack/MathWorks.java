package com.region.pack;

public class MathWorks extends AbstractClass implements UserInterface, PersonInterface {
    public void run() {
        System.out.println("run() -> MathWorks implements UserInterface");
    }

    public String getUserId() {
        return (String) "getUserId() -> MathWorks implements UserInterface";
    }

    public void showPerson() {}

    public void createPerson() {
        System.out.println("createPerson() -> MathWorks implements PersonInterface");
    }

    void showAbstractClass() {
        System.out.println("Abstract method through MathWorks");
    }
}
