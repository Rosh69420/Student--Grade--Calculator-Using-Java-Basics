
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] marks = new int[5];
        String grade;
        int totalMarks = 0;
        float totalPercentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("               Student Grade Calculator             ");
        System.out.println("----------------------------------------------------");
        System.out.println();

        for (int i = 0; i < marks.length;i++){
            System.out.print("Input marks of subject " + (i+1)+": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        totalPercentage = (totalMarks*100f)/(marks.length * 100);

        if(totalPercentage >= 95){
            grade = "A+";
        } else if (totalPercentage > 90) {
            grade = "A";
        } else if (totalPercentage > 85){
            grade = "B+";
        } else if (totalPercentage > 80) {
            grade = "B";
        } else if (totalPercentage > 75) {
            grade = "C+";
        } else if (totalPercentage > 70) {
            grade = "C";
        } else if (totalPercentage > 60) {
            grade = "D+";
        }
        else if(totalPercentage >= 50){
            grade = "D";
        }
        else {
            grade = "F";
        }

        System.out.println("Total marks: "+ totalMarks);
        System.out.println("Percentage: " + totalPercentage + "%");
        System.out.println("Grade: " + grade);

    }
}