package Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--) {
			reverse= reverse+str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		sc.close();
	}

}