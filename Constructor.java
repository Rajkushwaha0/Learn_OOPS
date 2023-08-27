public class constructor{
    public static void main(String args[]){
        Student s = new Student();                  //op -> This constructor is called...
        s.name="Suresh";
        s.rollno = 9;
        System.out.println(s.name +" "+s.rollno);   // suresh 9

        

        Student s1 = new Student("Raj");
        System.out.println(s1.name);                //op -> Raj
        s1.rollno=5;
        System.out.println(s1.rollno);              //op -> 5



    }
}

class Student{
    String name;
    int rollno;
//    constructor without argument 
    Student(){
        System.out.println("This constructor is called...");
    }

    //constructor with argument 
    Student(String name){
        this.name=name;
    }
}
//do not have return and void 
//have same name of class and structure 
//as they are called during object creation then memory is being allocated 
