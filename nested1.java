class nested1{
    public static void main(String args[]){
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                System.out.println("J:" +j);
            }
                System.out.println( "i:" +i);
        }
    }
}