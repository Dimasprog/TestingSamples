package com.region.pack;

class Runner {
    public static void main(String[] args) {
        System.out.println("\n\n\n_____________________________");

        Numbers numbers = new Numbers();
        AbstractClass abstractClass = new MathWorks();

        abstractClass.showAbstractClass();
        int rez = numbers.sum(5);
        System.out.println(rez);

        System.out.println("_____________________________\n\n\n\n");
    }
}
