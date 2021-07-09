class first extends Thread{
    public void run(){
        while(true){
            System.out.println("first");
            try{
                Thread.sleep(600);

            }catch(Exception ex){

            }
        }
    }
}
class thread2{
    public static void main(String args[]){
        first f= new first();
        f.start();
        while(true){
            System.out.println("main");
            try{
                Thread.sleep(600);
            }catch(Exception ex){}
        }
    }
}