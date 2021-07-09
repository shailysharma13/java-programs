class first{
    first(){

    }
    first(int x){
        System.out.println("x: "+x);
    }
    void show(){
        System.out.println("show");
    }
}
class cons3{
    public static void main(String args[]){
        new first().show(); 
    }
}