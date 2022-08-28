package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        // shark.swim();

        // ----> single and multilevel
        // Dog rocky = new Dog();
        // rocky.eat();
        // rocky.bark = "bhau bhau";
        // System.out.println(rocky.bark);
        // rocky.legs = 4;
        // System.out.println(rocky.legs);

        //hierarchial 
        Mammal human = new Mammal();
        human.eat();
        human.breathe();

    }
    
}

class Animal{
    String color;

    void eat(){
        System.out.println("eat food: ");
    }
    void breathe(){
        System.out.println("We breath: ");
    }
}

//------>this is single level inheritance
// class Mammal extends Animal{
//     int legs;
// }

// //------>this is multievel inheritance
// class Dog extends Mammal{
//     String bark;
// }


// *******-------This Mammal , Bird, Fish are hierarchial inheritance
class Mammal extends Animal{
    void walk(){
        System.out.println("Walk: ");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("I can fly yahh: ");
    }
} 
class Fish extends Animal{
    void swim(){
        System.out.println("I can swim buddy: ");
    }
}
//**********-----------> 



// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("We swim in water: ");
//     }
// }
