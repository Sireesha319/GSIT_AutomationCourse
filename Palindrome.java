package FirstPackage;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123321;
		int reverse=0;
		int original=n;
		while(n!=0) {
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		if(reverse==original) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}

}
