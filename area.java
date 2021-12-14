import java.util.Scanner;
public class area{
    public static void main(String args []){
        System.out.println("The area will show here ");
        //creates a Scanner object
        //creates an object of class AreaRect
        Scanner input = new Scanner(System.in);
        AreaRect c1 = new AreaRect();
        System.out.println("enter the length :");
        double length = input.nextDouble();
        System.out.println("Enter the breadth ");
        double breadth = input.nextDouble();
        System.out.println("The area of a rectangle of length "+c1.setLength(length)+" and breadth "+ci.setBrreadth(breadth)+" is "+c1.getRuturnArea());
    }
}