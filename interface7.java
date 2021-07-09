interface first{
    void show();
}
interface second extends first{
    void wow();
}
class third implements second{
    public void show(){
        System.out.println("show");
    }
    public void wow(){
        System.out.println("wow");
    }
    public void now(){
        System.out.println("now");
    }
}
class interface7{
    public static void main(String args[]){
        first f=new third();
        f.show();
        second s= new third();
        s.wow();
        ((third)s).now();
    }
}