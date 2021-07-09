import java.io.*;
class kb2{
    public static void main(String args[]){
        Console c1= System.console();
        System.out.println("enter no. : ");
        int x =Integer.parseInt(c1.readLine());
        System.out.println("enter second no.");
        int y=Integer.parseInt(c1.readLine());
        int c=x+y;
        System.out.println("C:"+c);
    }
}