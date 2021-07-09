class first extends Thread{
    public void run(){
        while(true){
            System.out.println("first");
            try{
                Thread.sleep(400);
            }catch(Exception ex){}
        }
    
        
    }
}
class thread3{
    public static void main(String args[]){
        first f= new first();
        f.start();
        System.out.println("Active Thread:" +Thread.activeCount());
        while(true){
            System.out.println("main");
            try{
                Thread.sleep(400);
            }catch(Exception ex){}
        }
    }
}