class first{
    static int show(){
        new first ().wow();
        return 10;
    }
    void wow(){
        System.out.println("wow");
    }
}
    class obj5{
        public static void main(String args[]){
            int z= first.show();
            System.out.println("z: " +z);
        }
    }
