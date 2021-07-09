import java.io.*;
class kb4{
    public static void main(String args[]) throws  IOException{
            InputStream is =System.in;
        System.out.println("enter a character: ");
        int value= is.read();
        System.out.println("C: " +(char)value);
        }
    
}