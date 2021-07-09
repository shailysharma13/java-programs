class myfun3{
    static void add(int x,int y){
        System.out.println(x+y);
    }
    static void sub(int x,int y){
        System.out.println(x-y);
    }
    public static void main(String args[]){
        char ch='-';
        switch(ch){
            case '+':
            add(12,2);
            break;
            case '-':
            sub(12,2);
            break;
            default:
            
            System.out.println("no roll no.found");
            break;
        }
    }
}