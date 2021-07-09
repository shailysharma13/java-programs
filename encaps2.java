class student{
    private int roll;
    private String name;
    public student(int roll,String name){
        this.roll=roll;
        this.name=name;

    }

    public int getRoll(){
        return roll;
    }


    public String getName(){
        return name;
    }
}
 
class encaps2{
    public static void main(String args[]){
        student s = new student(102,"shine");
        System.out.println("Roll:" +s.getRoll());
        System.out.println("Name:" +s.getName());

    }
}