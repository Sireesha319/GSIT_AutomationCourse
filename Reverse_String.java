package Strings;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String reverse="";
		for(int i= str.length()-1; i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		sc.close();
	}

}
