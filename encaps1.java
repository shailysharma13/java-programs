class student{
    private int roll;
    private String name;
    public void setRoll(int roll){
        this.roll=roll;
    }

    public int getRoll(){
        return roll;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
 
class encaps1{
    public static void main(String args[]){
        student s= new student();
        s.setRoll(10);
        s.setName("shaily");
        System.out.println("Roll:" +s.getRoll());
        System.out.println("Name:" +s.getName());

    }
}