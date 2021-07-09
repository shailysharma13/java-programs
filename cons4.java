class first{
    first(){
        System.out.println("first constructor");
    }
}
class second extends first{
    second(){
        System.out.println("second constructor");
    }
}
class cons4{
    public static void main(String args[]){
        new second();
    }
}