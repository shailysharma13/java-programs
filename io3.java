import java.io.*;
class io3{
    public static void main(String args[]) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a no:");
        int x=Integer.parseInt(br.readLine());
         System.out.println("enter second no:");
        int y=Integer.parseInt(br.readLine()); 
        System.out.println("c: "+(x+y));
    }
}
