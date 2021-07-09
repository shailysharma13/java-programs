class first extends Thread{
    public void run(){
        while(true){
            System.out.println("first");
        }
    }
}
class thread1{
    public static void main(String args[]){
        first f= new first();
        f.start();
        while(true){
            System.out.println("main");
        }
    }
}