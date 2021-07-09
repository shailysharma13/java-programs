abstract class first{
    first(){
        System.out.println("first");
    }
    abstract void show();
    void wow(){
        System.out.println("wow");
    }
} 
class second extends first{
    void show(){
        System.out.println("second");
    }
        void now(){
            System.out.println("now");
        }
}
class abstract10{
    public static void main(String args[]){
      first f=new second();
      f.show(); 
      
      f.wow();
      ((second)f).now(); 
    }
}