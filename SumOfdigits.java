package FirstPackage;

public class SumOfdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; //store the sum of digits by initializing sum to 0
		int n=1234; // initialize n to 1234
		while(n!=0) { 
			int d=n%10; //Get the last digit
			sum=sum+d; //add the digit to sum
			n/=10; // remove the last digit
		}
		System.out.println(sum); //print sum
	}

}
