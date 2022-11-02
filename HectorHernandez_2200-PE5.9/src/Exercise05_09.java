/***********************************************************************************
 * 
 * @author Hector Hernandez, PhD
 * Date: 10/28/2022
 *
 **********************************************************************************/
import java.util.Scanner;

public class Exercise05_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for the number of students
		// Assume that there are at least 2 students
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		System.out.print("Enter a student name: ");
		String student1 = input.next();
		System.out.print("Enter a student score: ");
		double score1 = input.nextDouble();
		
		System.out.print("Enter a student name: ");
		String student2 = input.next();
		System.out.print("Enter a student score: ");
		double score2 = input.nextDouble();
		
		// Make sure that student1 is the student with the highest score
		if( score1 < score2) {
			// swap student1, score1 with student2, score2 
			String tempStudent = student1;
			double tempScore = score1;
			student1 = student2;
			score1 = score2;
			student2 = tempStudent;
			score2 = tempScore;
		}
		// Assert: score1 >= score2
		for( int i=0; i< numberOfStudents -2; i++) {
			System.out.print("Enter a student name: ");
			String student = input.next();
			System.out.print("Enter a student score: ");
			double score = input.nextDouble();
			
			if( score > score1) {
				student2 = student1;
				score2 = score1;
				student1 = student;
				score1 = score;
			}
			else if(score > score2) {
				student2 = student;
				score2 = score;
			}	
		}
		
		System.out.println("Top two students:");
		System.out.println(student1 + "'s score is " + score1);
		System.out.println(student2 + "'s score is " + score2);

		input.close();;		
	}
}
