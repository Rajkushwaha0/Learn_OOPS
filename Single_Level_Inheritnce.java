public class SingleLevel {
    public static void main(String args[]){
        Mammals dog = new Mammals();
        dog.eat();
        dog.breathe();
        dog.color="Blue";
        System.out.println(dog.color);
        dog.getColor("brown");

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
