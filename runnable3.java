class first implements Runnable{
    Thread t;
    public first(){
        t=new Thread(this);
        t.start();
    }

    public void run(){
        while(true){
         System.out.println("first");
         try{
            Thread.sleep(400);
            }catch(Exception ex){}
        }
    }
}
class runnable3{
    public static void main(String args[]){
        first f=new first();
        while(true){
            System.out.println("Name:" +f.t.getName());
            while(true){
                System.out.println("main");
            
                try{
                Thread.sleep(400);
                }catch(Exception ex){}
            }
        }
    }
}