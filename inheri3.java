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
class inheri3{
    public static void main(String args[]){
        papa p = new papa();
        p.bike();
    }
}