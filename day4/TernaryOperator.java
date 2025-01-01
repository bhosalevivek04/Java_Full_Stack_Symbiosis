public class TernaryOperator {
    public int largestAmongNumber(int number1, int number2, int number3) {
        int largest = (number1 > number2) ? (number1 > number3) ? number1 : number3 : (number2 > number3) ? number2 : number3;
        return largest;
    }
}
