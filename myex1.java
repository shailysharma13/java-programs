class myex1{
    public static void main(String args[]){
        System.out.println("main");
        try{
            int a=0,b=0,c=0;
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            c=a/b;
            System.out.println("C=" +c);
        }catch(Exception ex){
            System.out.println(ex);
        }
            System.out.println("finish");
        
    }
}