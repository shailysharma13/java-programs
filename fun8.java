class fun8{
    static void wow(){
        System.out.println("WOW");
    }
    static int show(int x,int y){
        wow();
        return 12;
    }
    public static void main(String args[]){
        int z=show(12,2);
        System.out.println(z);
    }
}