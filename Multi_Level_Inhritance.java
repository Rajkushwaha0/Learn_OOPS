public class MultiLevel {
    public static void main(String args[]){
        Dog dog = new Dog();
        dog.eat();
        dog.breathe();
        dog.color="Blue";
        System.out.println(dog.color);
        dog.getColor("brown");
        dog.breed="DOGS BREED";
        System.out.println(dog.breed);

    }
}
class Animal{
    void eat(){
        System.out.println("Animals can eat");
    }
    void breathe(){
        System.out.println("Animals can breathe");
    }
}

class Mammals extends Animal{
    //properties(Attributes)
    int legs;
    String color;
    //Methods(behaviour)
    void getColor(String color){
        System.out.println("Animals color is"+color);
    }
    void walk(){
        System.out.println("Mammals can walk");
    }
}
class Dog extends Mammals{
    String breed;
}
