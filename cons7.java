class first{
    first(){
        System.out.println("first");
    }
    first(int x){
        System.out.println(x);
    }
}
class second extends first{
    
        second(){
            super(12);
            System.out.println("second");
        }
    }
class cons7{
    public static void main(String args[]){
        new second();
    }
}