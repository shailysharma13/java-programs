class array8{
    public static void main(String args[]){
        int a[][]={
            {2,3,4},
            {5,6,7}
        };
        for(int x[]:a){
            for(int y:x){
                System.out.println(""+y);
            }
                System.out.println();
        }
    }
}