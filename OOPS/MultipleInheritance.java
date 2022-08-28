package OOPS;

public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.nonveg();
        
    }
    
}

interface Herbivore{
    void nonveg();
}
interface Carnivore{
    void veg();
}

class Bear implements Herbivore, Carnivore{
    public void nonveg(){
        System.out.println("Eat fish, meat, eggs");
    }
    public void veg(){
        System.out.println("Eat grasses, vegetabless: ");
    }
}