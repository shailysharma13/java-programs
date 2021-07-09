class first{
    void star(int type){
        for(int i=1;i<10;i++){
            for(int j=0;j<i;j++){
                if(type==1){
                    System.out.println("*");

                }else if(type==2){
                    System.out.println("@");
                }else if(type==3){
                    System.out.println("#");
                }
            }
             System.out.println();
        }
    }
}
class myfun1{
    public static void main(String args[]){
        first f=new first();
        f.star(1);
        f.star(2);
        f.star(3);
    }
}