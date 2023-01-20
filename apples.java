import java.util.Scanner;

public class apples {
    public static void main(String[] args) {
        int age = 21;
        System.out.println(age > 50 ? "You are old" : "You are young");
        int total = 0;
        int grade, average;
        int counter = 0;

        try (Scanner input = new Scanner(System.in)) {
            while (counter < 10){
                grade = input.nextInt();
                total = total + grade;
                counter++;
            }
        }
        average = total/10;
        System.out.println("Your average is " + average);
    }
}
