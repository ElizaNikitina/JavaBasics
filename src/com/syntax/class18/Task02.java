package com.syntax.class18;

public class Task02 {

	String name;
	int gradeA, gradeB, gradeC;

	public void calculateAverage() {
		int d;
		d = (gradeA + gradeB + gradeC) / 3;
		System.out.println("Student " + name + " average grade is " + d);
	}

	Task02(String newName, int newgradeA, int newgradeB, int newgradeC) {
		name = newName;
		gradeA = newgradeA;
		gradeB = newgradeB;
		gradeC = newgradeC;
	}

	public static void main(String[] args) {

		Task02 student1 = new Task02("Eliza", 5, 3, 4);
		student1.calculateAverage();
		Task02 student2 = new Task02("Artem", 3, 3, 4);
		student2.calculateAverage();
		Task02 student3 = new Task02("Oleg", 4, 3, 4);
		student3.calculateAverage();
		Task02 student4 = new Task02("Andrei", 4, 4, 4);
		student4.calculateAverage();
		Task02 student5 = new Task02("Anya", 5, 5, 4);
		student5.calculateAverage();
	}

}
