class first{
    void vote(int age){
        if(age<18){
            throw     new
            ArithmeticException("not valid");
        }else{
            System.out.println("welcome for vote");
        }
    }
}
class myex6{
    public static void main(String args[]){
        System.out.println("main");
                first f=new first();
                f.vote(13);
            System.out.println("finish");
    }
}