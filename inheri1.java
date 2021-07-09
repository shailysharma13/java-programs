class papa{
    void bike(){
    System.out.println("apache");
    }
}
class sonu extends papa{
    void cycle(){
        System.out.println("hero");
    }
}
class inheri1{
    public static void main(String args[]){
        sonu s=new sonu();
        s.bike();
        s.cycle();
    }
}