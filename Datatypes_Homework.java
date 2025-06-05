package FirstPackage;

public class Datatypes_Homework {

	public static void main(String[] args) {
		//Sireesha_Boddu
		//1.Store makes of 3 subjects using data type-integer
		int Math=90;
		int Science= 87;
		int English= 94;
		
		//2.Calculate the total marks using Arithmetic operators
		int TotalMarks=Math+Science+English;
		
		//3.Calculate the Average marks
		Double AverageMarks=TotalMarks/3.0; //allow decimal points
		
		//4.Print both total and average marks
		System.out.println("Total marks:" +TotalMarks);
		System.out.println("Average marks:" +AverageMarks);
		
		//5.Change the data type of average variable
		//using integer data type
		int Average= TotalMarks/3; //removes decimal part
		System.out.println("Average marks:" +Average);
		
		//using float data type
		float AvgMarks= TotalMarks/3.0f;
		System.out.println("Average marks:" +AvgMarks);
	}
}