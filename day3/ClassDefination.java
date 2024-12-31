public class ClassDefination {
    //instance varible : stores current state
    static int variable1=10;
    int variable2;

    //Methods : used for accessing and modifying instance variable
    public void printVariable(){
        System.out.println(variable1);
        System.out.println(variable2);
    }

    //constructor
    public ClassDefination(){

    }

    //static block
    static{
        System.out.println(variable1);
    }

    //instance block
    {
        variable1=100;
        variable2=200;
        System.out.println(variable2);
    }
    public static void main(String[] args) {
        
    }
}
