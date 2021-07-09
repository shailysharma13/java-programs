interface first{
    void shape();
}
class second implements first{
    public void shape(){
        System.out.println("triangle");
    }
}
class third implements first{
    public void shape(){
        System.out.println("square");
    }
}
class interface6{
    public static void main(String args[]){
        first f=new second();
        f.shape();
        first f1=new third();
        f1.shape();
    }
}