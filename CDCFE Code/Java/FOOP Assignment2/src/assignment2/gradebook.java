package assignment2;

import java.util.Scanner;

public class gradebook {
	static Scanner input = new Scanner(System.in);
	private  String subject;
	private int subNum=1, total, points, grade;
	
	void gradebooks() {
		
		for(int i=0;i<6;i++) {
			System.out.println("Enter subject "+subNum+":");
			subject = input.next();
			System.out.println("Enter grade for "+subject+":");
			grade = input.nextInt();
			point();
			System.out.println("Points: "+points);
			subNum++;
			total = points + total;
		}
		System.out.println("Total Points: "+total);
	}

	private void point() {
		
		if (grade >= 90) {
			points = 100;
		}
		else if (grade >= 80) {
			points = 88;
		}
		else if (grade >= 70) {
			points = 77;
		}
		else if (grade >= 60) {
			points = 66;
		}
		else if (grade >= 50) {
			points = 56;
		}
		else if (grade >= 40) {
			points = 46;
		}
		else if (grade >= 30) {
			points = 37;
		}
		else {
			points = 0;
		}
		
	}
}
