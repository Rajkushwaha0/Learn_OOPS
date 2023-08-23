public class GetterAndSetter {
    public static void main(String args[]){
        Vehicle bike = new Vehicle();

        bike.setUserName("Raj");
        bike.setPassword(12345);
        System.out.println(bike.getUserName());  //Raj
        System.out.println(bike.getPassword());  //12345

        bike.username="abc";
        bike.setPassword(890);
        //we cannot make password access because it is private (only access in its own class)
        //bike.password=123;   error
        System.out.println(bike.getUserName());  //abc
        System.out.println(bike.getPassword());  //890

    }
}

class Vehicle{
    public String username;
    private int password;
    //setter
    void setUserName(String user){
        this.username=user;
    }
    void setPassword(int pwd){
        this.password=pwd;
    }
    //getter
    String getUserName(){
        return this.username;
    }
    int getPassword(){
        return this.password;
    }



}
