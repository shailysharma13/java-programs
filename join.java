class join extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
                }
                System.out.println(i);
            }
        }

        public static void main(String args[]){
             join t1=new join();  
             join t2=new join();  
             join t3=new join();  
            t1.start();
            try{
                t1.join();

            }catch(Exception e){
                System.out.println(e);
            }
            t2.start();
            t3.start();
        
    }
}