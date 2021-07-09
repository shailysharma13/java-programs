class myex3{
    public static void main(String args[]){
        System.out.println("main");
        try{
            int a=0,b=0,c=0;
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            c=a/b;
            System.out.println("C:" +c);
        }catch(ArithmeticException ex){
            System.out.println("arithmetic:"+ex);

        }catch(Exception ax){
            System.out.println(ax);
        }finally{
            System.out.println("i will run no matter wht");
        }
            System.out.println("finish")
    }
}