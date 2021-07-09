class first{
    int show(){
        return 10;
    }

}
class obj4{
    public static void main(String args[]){
        first f=new first();
        int z = f.show();
        System.out.println("Z :" +z);
    }
}