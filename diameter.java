package diameter;

public class diameter {
  public static void printArea(double diameter) {
    double radius;
    double area;
    double piVal = 3.14159265; // value of pi
    
    radius = diameter / 2.0; // equation to calculate radius given the diameter
    area = piVal * radius * radius; // equation for area
    System.out.print(diameter + " inches is "); // prints out given diameter
    System.out.print(area + " inches squared."); // prints out calculated area
  }
  public static void main (String [] args) {
    printArea(12.0); // example value
    printArea(16.0); // example value
  }
}
