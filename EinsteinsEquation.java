import java.lang.Math;
import java.util.Scanner;

class EinsteinsEquation {
  public static void main(String[] args) {
    double c = 2.998 * (Math.pow(10, 8));
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("What is the mass of your object: ");
    String massString = myObj.nextLine();
    double massDouble = Double.parseDouble(massString);
    double energy = massDouble * (c * c);
    System.out.println(massString + "kg of matter contains " + energy + "J");
  }
}
