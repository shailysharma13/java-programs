class first{
    int star(int a,int b){

        return(a+b);
    }
}
class myfun2{
    public static void main(String args[]){
        first f=new first();
        int z=f.star(1,f.star(2,f.star(3,5)));
        System.out.println("Z: "+z);
    }
}