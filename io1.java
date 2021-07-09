import java.io.*;
class io1{
    public static void main(String args[]) throws IOException{
        InputStream is=System.in;
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter a name:");
        String name=br.readLine();
        System.out.println("name is: "+name);
    }
}
