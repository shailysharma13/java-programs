class array4{
    public static void main(String args[]){
        int a[]={2,4,6,8,9};
        for(int i=0;i<5;i++){
            if(i==3){
                continue;
            }
            System.out.println(a[i]);
        }
    }
}