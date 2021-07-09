class first{
    first(){}
    first(int x){
        System.out.println(x);
    }
}
class second extends first{
    second(){
        System.out.println("second constructor");
    }
}
class cons6{
    public static void main(String args[]){
        new second();
    }
}