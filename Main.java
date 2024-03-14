

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       System.out.print("Enter test case number: ");
        Scanner scanner = new Scanner(System.in);
        int testCaseNumber = scanner.nextInt();

        switch (testCaseNumber) {

            case 1 -> {

                Student student1 = new Student("Jemar Jude", "Maranga", 17);
                System.out.println("Test Case 1: Student under 18");
                System.out.println(student1);
            }
            case 2 -> {

                Student student2 = new Student("Jemar Jude", "Maranga", 17);
                System.out.println("Test Case 2: Increase age of student1");
 
                student2.increaseAge();
                System.out.println(student2);
            }
            case 3 -> {

                Student student3 = new Student("Jose", "Cruz", 19);
                System.out.println("Test Case 3: Student over 18");
                System.out.println(student3);
            }
            default -> System.out.println("Invalid test case number.");
        }
    }
}