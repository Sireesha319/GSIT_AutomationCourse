package FirstPackage;

public class SkipMultiplesOfFive_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sireesha_Boddu
		for(int i=1;i<=100;i++) { //Loops from 1 to 100
			if(i % 5 == 0) { //checks if the number is divisible by 5
				continue; //skips the current iteration
			}
			System.out.println(+i);
		}
	}

}