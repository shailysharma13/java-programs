class first{
    first(int x){
        System.out.println(x);
    }
}
class second extends first{
    second(){
        System.out.println("second constructor");
    }
}
class cons5{
    public static void main(String args[]){
        new second();
    }
}