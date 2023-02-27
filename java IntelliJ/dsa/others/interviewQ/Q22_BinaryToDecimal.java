package dsa.others.interviewQ;

public class Q22_BinaryToDecimal {
	public static int binaryToDecimal(int binary) {
		int temp = binary;
		int num = 0;
		int i = 0;
		while(temp > 0) {
			int digit = temp % 10;
			temp /= 10;
			num += (digit*(Math.pow(2, i++)));
		}
		
		return num;
	}
	public static int decimalToBinary(int n) {
		
		int temp = n;
		int decimal = 1;
		while(temp > 0) {
			decimal = (decimal*10) + (temp%2);
			temp /= 2;
		}
		
		temp = decimal;
		decimal = 0;
		while(temp > 1) {
			decimal *= 10;
			decimal += (temp%10);
			temp /= 10;
		}
		return decimal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryToDecimal(0));
		System.out.println(binaryToDecimal(01));
		System.out.println(binaryToDecimal(10));
		System.out.println(binaryToDecimal(11));
		System.out.println(binaryToDecimal(100));
		System.out.println(binaryToDecimal(101));
		System.out.println(binaryToDecimal(111));
		System.out.println(binaryToDecimal(1000));
		
		System.out.println(decimalToBinary(0));
		System.out.println(decimalToBinary(1));
		System.out.println(decimalToBinary(2));
		System.out.println(decimalToBinary(3));
		System.out.println(decimalToBinary(4));
		System.out.println(decimalToBinary(5));
		System.out.println(decimalToBinary(6));
		System.out.println(decimalToBinary(7));
		System.out.println(decimalToBinary(8 ));
		
	}

}
