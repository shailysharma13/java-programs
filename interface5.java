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

    public void now(){
        System.out.println("now");
    }

} 

class interface5{
    public static void main(String args[]){
        first f=new third();
        f.show();
        second s=new third();
        s.wow();
        ((third)s).now();
    }
}
