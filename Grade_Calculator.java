package Task;

import java.util.Scanner;

public class Grade_Calculator {
	public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);

	       System.out.print("Enter the number of subjects: ");
	       int numSubjects = input.nextInt();

	       int Total_Marks = 0;
	       for (int i = 1; i <= numSubjects; i++) {
	           System.out.print("Enter marks for subject " + i + " (out of 100): ");
	           int marks = input.nextInt();
	           Total_Marks += marks;
	       }

	       double avg_percentage = (double) Total_Marks / (numSubjects * 100) * 100;
	       String grade = calculateGrade(avg_percentage);

	       System.out.println("\nTotal Marks: " + Total_Marks);
	       System.out.println("Average Percentage: " + avg_percentage + "%");
	       System.out.println("Grade: " + grade);
	   }

	   static String calculateGrade(double percentage) {
	       if (percentage >= 90) {
	           return "A";
	       } else if (percentage >= 80) {
	           return "B";
	       } else if (percentage >= 70) {
	           return "C";
	       } else if (percentage >= 60) {
	           return "D";
	       } else {
	           return "F";
	       }
	   }
}
