import java.util.Scanner;
/**
 * finds if a number is a prime number or not
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // asks user for a number and records it for later
    System.out.println("Which number would you like to check?");
    int count = 2;
    int number = input.nextInt();
    int quotientCheck = 10;
    while (count < number){
      quotientCheck = number % count;
      count = count + 1;
      if (quotientCheck == 0){
        break;
      } 
    } 
    if (quotientCheck == 0){
      System.out.println(number + " is not a prime number");
    } else {
      System.out.println(number + " is a prime number");
    }
  } 
}
