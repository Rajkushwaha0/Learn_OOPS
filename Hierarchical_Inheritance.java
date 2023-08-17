public class Hierarchical {
    public static void main(String args[]){
        Mammals human  = new Mammals();
        human.legs=2;
        System.out.println(human.legs);

        human.color="black";
        System.out.println(human.color);

        human.walk();


        Fish tuna = new Fish();
        tuna.fins=4;
        System.out.println(tuna.fins);

        tuna.getColor("green");
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
