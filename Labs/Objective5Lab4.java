import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = 43;

System.out.println("Please enter a number: ");
num = input.nextInt();

if(num % 42 == 1) {
  System.out.println("The number is odd");
}
  }
}
