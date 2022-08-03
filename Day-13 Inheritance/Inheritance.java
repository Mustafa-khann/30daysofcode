import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
		String firstName;
		String lastName;
		int id;
		int[] testScores;
		int Grade;
    
    // Write your constructor here
	public static void printPerson(String firstName, String lastName, int id, int[] testScores)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.testScores = testScores;
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("ID:"+id);
	}
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	public static int calculate()
		{
			for(int i = 0; i<testScores.length; i++)
			{
				Grade = testScores[i] + testScores[i+1];
			}
			
			if(Grade/testScores.length >=90 && Grade/testScores.length <= 100)
			{
				return "O";
			}
			if(Grade/testScores.length >=80 && Grade/testScores.length <= 89)
			{
				return "E";
			}
			if(Grade/testScores.length >=70 && Grade/testScores.length <= 79)
			{
				return "A";
			}
			if(Grade/testScores.length >=55 && Grade/testScores.length <= 69)
			{
				return "P";
			}
			if(Grade/testScores.length >=40 && Grade/testScores.length <= 55)
			{
				return "D";
			}
			if(Grade/testScores.length <= 39)
			{
				return "T";
			}
			
		}
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}