public class TypeCasting {
    public void printData(float a, float b) {
        System.out.println(a + " : " + b);
    }

    public static void main(String[] args) {
        TypeCasting objTypeCasting = new TypeCasting();
        objTypeCasting.printData(10, 20);
        objTypeCasting.printData((float) 10.559256187685, (float) 20.61685681630181);
    }
}
