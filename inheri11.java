class papa{
    void scooter(){
        System.out.println("tvs");
    }
}
class monu extends papa{
    void bike(){
        System.out.println("apache");
    }
}
class sonu extends papa{
    void cycle(){
        System.out.println("hero");
    }
}
class inheri11{
    public static void main(String args[]){
        papa p=new monu();
        p.scooter();
        ((monu)p).bike();
    }

}