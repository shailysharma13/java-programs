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
class inheri7{
    public static void main(String args[]){
        sonu s=new sonu();
        s.bike();
        s.scooter();
        s.cycle();
    }
}