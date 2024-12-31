public class MainConstructor {
    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample();
        obj1.printValues();

        ConstructorExample obj2 = new ConstructorExample(10,20);
        obj2.printValues();

        ConstructorExample obj3 = new ConstructorExample(obj2);
        obj3.printValues();
    }
}
