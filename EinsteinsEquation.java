import java.lang.Math;
import java.util.Scanner;

class EinsteinsEquation {
  public static void main(String[] args) {
    double c = 2.998 * (Math.pow(10, 8));
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("What is the mass of your object: ");
    String massString = myObj.nextLine();
    double massDouble = -1;
    try {
      massDouble = Double.parseDouble(massString);
    } catch (NumberFormatException e) {
      System.out.println("Not valid mass, must be a number");
      System.exit(1);
    }
    double energy = massDouble * (c * c);
    System.out.println(massString + "kg of matter contains " + energy + "J");
  }
}
