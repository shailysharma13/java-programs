class first extends Thread{
    public void run(){
        while(true){
            System.out.println("first");
            try{
                Thread.sleep(400);
            }catch(Exception ex){

            }
        }
    }
}
class thread5{
    public static void main(String args[]){
        first f=new first();
        f.start();
        f.setName("shaily");
        f.setPriority(9);
        System.out.println("Active Thread:" +Thread.activeCount());
        System.out.println("Thread id:" +f.getId());
         System.out.println("Thread name:" +f.getName());
          System.out.println("Thread priority:" +f.getPriority());
    while(true){
        System.out.println("main");
            try{
                Thread.sleep(400);

            }catch(Exception ex){}
        }
    }
}