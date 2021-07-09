class first{
    void show(){
        System.out.println("first");
    }
}
class second extends first{
    void show(){
        System.out.println("second");
        super.show();
    }
}
class cons10{
    public static void main(String args[]){
        new second().show();
    }
}


