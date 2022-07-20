import java.util.*;

class Calc
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int numOne = scan.nextInt();
    int numTwo = scan.nextInt();
    
    // Adding two numbers
    System.out.println("The sum of given number is : " + (numOne + numTwo));
    
    // Subtract two numbers
    System.out.println("The subtraction of given numbers is : " + (numOne - numTwo));
    
    // Multiply two numbers
    System.out.println("The multiplication of given numbers is : " + (numOne * numTwo));
  }
}
