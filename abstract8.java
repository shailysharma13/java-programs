abstract class first{
    abstract void show();
} 
class second extends first{
    void show(){
        System.out.println("second");
    }
}
class abstract8{
    public static void main(String args[]){
        first f=new second();
        f.show();
    }
}