class dadaji{
    void scooter(){
        System.out.println("tvs");
    }
}
class papa extends dadaji{
    void bike(){
        System.out.println("apache");
    }
}
class sonu extends papa{
    void cycle(){
        System.out.println("hero");
    }
}
class inheri8{
    public static void main(String args[]){
    papa p=new sonu();
    p.scooter();
    p.bike();
    ((sonu)p).cycle();
    }
}