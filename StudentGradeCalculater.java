import java.util.Scanner;

public class StudentGradeCalculater {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] marks = new int[5];
    int totalMarks = 0;

    for (int i = 0; i < 5; i++) {
        System.out.print("Enter marks for subject" + (i + 1) + "(out of 100):");
        marks[i] = scanner.nextInt();
        totalMarks += marks[i];
    }

    double averagePercentage = (double) totalMarks / 5;

    char grade;
    if ( averagePercentage >= 90 ) {
        grade ='A';
    } else if ( averagePercentage >= 80 ) {
        grade ='B';
    } else if ( averagePercentage >= 70 ) {
        grade ='C';
    } else if ( averagePercentage >= 60 ) {
        grade ='D';
    } else {
        grade ='F';
    }
    System.out.println("Total Marks:" + totalMarks);
    System.out.println("Averge Percentage:" + averagePercentage + "%");
    System.out.println("Grade: " + grade);

}

}