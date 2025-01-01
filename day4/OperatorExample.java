public class OperatorExample {
	public static void main(String[] args) {
		int a=5; //0101
		int b=3; //0011
//		int result = ++a ^ b++; //0110
//		int result1= b++ + b++*a++;
		int r=b++*b++;
		System.out.println(r);
	}
}
