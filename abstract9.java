abstract class first{
    first(){
        System.out.println("first");
    }
    abstract void show();
} 
class second extends first{
    void show(){
        System.out.println("second");
    }

}
class abstract9{
    public static void main(String args[]){
      first f=new second();
      f.show();  
    }
}