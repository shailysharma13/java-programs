class first{
    void show(){
        System.out.println("first");
    }
}

class second extends first{
    void show(){
        System.out.println("second");
       show(); 
    }
}
class cons9{
    public static void main(String args[]){
        new second().show();
    }
}