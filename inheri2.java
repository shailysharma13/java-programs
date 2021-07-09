class Papaa{
    void bike(){
        System.out.println("apache");
    }
}
class Sonu extends Papaa{
    void cycle(){
        System.out.println("hero");
    }
}
class inheri2{
    public static void main(String args[]){
    Papaa p = new Sonu();
    
    p.bike();
    } 
}