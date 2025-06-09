package FirstPackage;

public class ConditionalStatements_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sireesha_Boddu
		//1.Accepts Three subject 
		int math=96;
		int science=95;
		int english=34;
		float Average = (math+science+english)/3.0f;
		System.out.println("Average:" +Average);
		//Based on average prints the grade
		//print a Custom messages based on grade
		String Grade;
		if (Average >= 90 && Average<= 100) {
			Grade="A+";
			System.out.println("Grade:" +Grade);
			System.out.println("Excellent performance!");
		}
		else if(Average >= 75 && Average<= 89) {
			Grade="A";
			System.out.println("Grade:" +Grade);
			System.out.println("Excellent performance!");
		}
		else if(Average >= 60 && Average<= 74) {
			Grade="B";
			System.out.println("Grade:" +Grade);
			System.out.println("Keep improving.");
		}
		else if(Average >= 40 && Average<= 59) {
			Grade="C";
			System.out.println("Grade:" +Grade);
			System.out.println("Keep improving.");
		}
		else {
			Grade="F";
			System.out.println("Grade:" +Grade);
			System.out.println("Please work harder next time.");
			
		}	
		/*System.out.println("Grade:" +Grade);
		
		//print a Custom messages based on grade
		if (Grade.equals("F")) {
			System.out.println("Please work harder next time.");
		}
		else if(Grade.equals("A+") || Grade.equals("A")) {
			System.out.println("Excellent performance!");
		}
		else {
			System.out.println("Keep improving.");
		}*/	
		
		//Check if any subject mark is below 35
		if (math<35 || science<35 || english<35) {
		System.out.println("Failed due to low score in at least one subject.");
		}
	}
}