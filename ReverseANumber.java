package FirstPackage;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=97567;
		int rev=0;
		int digit;
		while(n!=0) {
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);
	}

}
