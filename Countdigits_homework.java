package FirstPackage;

public class Countdigits_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4567;
		int count=0;
		if(n==0) {
			count=1;
		}else {
			while(n!=0) {
				n=n/10;
				count++;
			}
		}
		System.out.println("Count the number of digits:" +count);
	}

}
