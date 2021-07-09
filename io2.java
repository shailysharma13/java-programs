import java.io.*;
class io2{
    public static void main(String args[]) throws IOException{
        InputStream is=System.in;
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter a no:");
        int x=Integer.parseInt(br.readLine());
         System.out.println("enter a second no:");
        int y=Integer.parseInt(br.readLine()); 
        System.out.println("c: "+(x+y));
    }
}
