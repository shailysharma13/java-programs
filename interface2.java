interface first{
    void show();
}
class second implements first{
    public void show(){
        System.out.println("show");
    }
}
class interface2{
    public static void main(String args[]){
        first f=new second();
        f.show();
    }
}