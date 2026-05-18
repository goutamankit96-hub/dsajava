

public class Hierarchial_inheritance {
    
    public static void main(String[] args) {
       Fish shark = new Fish();
       shark.breathe();
       shark.swim();
        
    }
}
// Base class
class Animal {
    String color;
     
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}
// Dericlassved 
class Mammal extends Animal {

   void walk(){
    System.out.println("walk");
   }
    
}
class Fish extends Animal {
    
   void swim(){
    System.out.println("swims");
   }
    
}
class Bird extends Animal {
    
   void fly(){
    System.out.println("fly");
   }
    
}
