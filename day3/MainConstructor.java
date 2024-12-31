package day3;
public class MainConstructor {
    public static void main(String[] args) {
        ConstructorExample c = new ConstructorExample();
        ConstructorExample obj1 = new ConstructorExample(10,20);
        ConstructorExample obj2 = new ConstructorExample(obj1);
    }
}
