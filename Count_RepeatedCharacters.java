package Strings;

import java.util.Scanner;

public class Count_RepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		Character ch =sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}	
		System.out.println(count);
		sc.close();
	}

}
