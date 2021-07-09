interface first{
    void show();
}
interface second{
    void wow();
}
class third implements first,second{
    public void show(){
        System.out.println("show");
    }
    public void wow(){
        System.out.println("wow");
    }
}
class interface4{
    public static void main(String args[]){
        first f= new third();
        f.show(); 
        second s=new third();
        s.wow();
    }
}