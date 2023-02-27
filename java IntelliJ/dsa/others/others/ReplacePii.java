package dsa.others.others;
public class ReplacePii {

	public static String replacePi(String s) throws InterruptedException {//6->5->3->1
		if(s.length()<=1) {
			System.out.println("Inside return s");
//			Thread.sleep(2000);
			return s;
		}
		
		if(s.charAt(0)=='p' && s.charAt(1)=='i') {
			String smallOuput = replacePi(s.substring(2));//pip//p
//			System.out.println(replacePi(s.substring(2)));
//			Thread.sleep(2000);
			return "3.14"+smallOuput;
		}
		
		else {
			String smallOutput = replacePi(s.substring(1));//pipip
//			System.out.println(replacePi(s.substring(1)));
//			Thread.sleep(2000);
			return s.charAt(0)+smallOutput;
		}
	}
	static <T> void print(T v) {
		System.out.println(v);
	}
	public static void main(String[] args) throws InterruptedException {
		print(5+'a');
//		String string = "apipip";//6
//		System.out.println(Integer.SIZE);
//		System.out.println(replacePi(string));
	}

}