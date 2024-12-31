public class ConstructorExample {
    int number1;
    int number2;

    // default constructor
    public ConstructorExample() {
        number1 = 10;
        number2 = 15;
    }

    // parameterized constructor: 
    // A constructor that has parameters is called a parameterized constructor.
    // It is used to initialize objects with different values.
    public ConstructorExample(int number3, int number4) {
        this.number1 = number3;
        this.number2 = number4;
    }

    // Copy Constructor: A copy constructor is a member function which initializes an object using another object of the same class.
    public ConstructorExample(ConstructorExample obj3) {
        this.number1 = obj3.number1;
        this.number2 = obj3.number2;
    }

    public void printValues(){
        System.out.println("Number 1: "+number1);
        System.out.println("Number 2: "+number2);
    }
}