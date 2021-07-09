class runtime1{
    public static void main(String args[]){
        System.out.println("main");
        try{
            System.out.println(args[0]);

        }catch(Exception ex){
            System.out.println(ex);

        }
        System.out.println("finish");

    }
}