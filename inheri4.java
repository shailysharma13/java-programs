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
class inheri4{
    public static void main(String args[]){
        papa p=new sonu();
        ((sonu)p).cycle();
    }
}