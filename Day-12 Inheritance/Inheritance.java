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
	        int[] testScores;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
		
    
    // Write your constructor here
    Student(String firstName, String lastName, int identification , int [] scores)
        {
        super(firstName,lastName,identification );
        this.testScores=scores;
    }
    
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	public char calculate()
		{
            int Grade = 0;
			for(int i = 0; i<testScores.length; i++)
			{
				Grade += testScores[i];
			}
			int finalGrade = Grade/testScores.length;
			if( finalGrade >=90 && finalGrade <= 100)
			{ 
				return 'O';
			}
			else if(finalGrade >=80 && finalGrade <= 89)
			{
				return 'E';
			}
			else if(finalGrade >=70 && finalGrade <= 79)
			{
				return 'A';
			}
			else if(finalGrade >=55 && finalGrade <= 69)
			{
				return 'P';
			}
			else if(finalGrade >=40 && finalGrade <= 54)
			{
				return 'D';
			}
			else if(finalGrade <= 39)
      {
				return 'T';
			}
      else
      return 'M';
		}
}

class Solution {