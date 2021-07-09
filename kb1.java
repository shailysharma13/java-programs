import java.io.*;
class kb1{
    public static void main(String args[]){
        Console c1= System.console();
        System.out.println("enter your name: ");
        String name=c1.readLine();
        System.out.println("my name is : " +name);
    }
}