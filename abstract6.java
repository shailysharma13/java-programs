abstract class first{
    abstract void show();
} 
class second extends first{
    void show(){
        System.out.println("Second");
    }
}
class abstract6{
    public static void main(String args[]){
       new first(); 
    }
}