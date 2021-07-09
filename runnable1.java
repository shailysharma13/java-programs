class first implements Runnable{
    public void run(){
        while(true){
            System.out.println("first");
            try{
                Thread.sleep(400);
            }catch(Exception ex){}
        }
    }
}
class runnable1{
    public static void main(String args[]){
        first f=new first();
        Thread t = new Thread(f);
        t.start();
        while(true){
            System.out.println("main");
            try{
                Thread.sleep(400);
            }catch(Exception ex){}
        }
    }
}