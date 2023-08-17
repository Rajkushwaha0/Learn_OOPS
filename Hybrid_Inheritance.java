public class Hybrid {
    public static void main(String args[]){
        Dog gullyDog = new Dog();
        gullyDog.eat();
        gullyDog.typeOfFood("Pedigree");
        gullyDog.getColor("brown");
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
        System.out.println("Mammals color is "+color);
    }
    void walk(){
        System.out.println("Mammals can walk");
    }
}
class Fish extends Animal{
    int fins;
    String color;
    void getColor(String color){
        System.out.println("Fish color is "+color);
    }
}

class Dog extends Mammals{
    String breed;
    void typeOfFood(String food){
        System.out.println("Dogs can eat "+food);
    }
}
