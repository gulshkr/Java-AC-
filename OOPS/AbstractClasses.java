package OOPS;

public class AbstractClasses {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.walk();
        // h.eats();
        // System.out.println(h.color);

        Mustang must = new Mustang();
    }
    
}

abstract class Animal{
    String color;
    Animal (){
        System.out.println("Animal constructor called ");
    }
    void eats(){
        System.out.println("They eats: ");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called ");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("horse walk on four legs: ");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called ");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken walk on 2 legs: ");
    }
}