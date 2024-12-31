package day3;
public class ConstructorExample {
    int a;
    int b;
    //default constructor
    public ConstructorExample(){

    }

    //parameterized constructor
    public ConstructorExample(int a,int b){
        
    }

    //copy constructor
    public ConstructorExample(ConstructorExample obj2){
        this.a=obj2.a;
        this.b=obj2.b;
    }
}
