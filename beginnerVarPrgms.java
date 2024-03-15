import java.util.Scanner;
public class beginnerVarPrgms {
	public static void main (String[] args) {
		Scanner myScanObj = new Scanner(System.in);
		//7
		//aperently the other two sheets were just notes, so there is no number 7. I really wish that I had known those were there before I started.

		//6
		System.out.print("What is the total number of gallons of gas used on your trip? ");
		int gas = myScanObj.nextInt();
		System.out.print("What was the odometer reading at the start of the trip? ");
		int odoStart = myScanObj.nextInt();
		System.out.print("What was the odometer reading at the end of the trip? ");
		int odoEnd = myScanObj.nextInt();
		System.out.println("The total trip distance was " + (odoEnd-odoStart) + " and the number of miles per gallon is " + ((odoEnd-odoStart)/gas) + ".");

		//5
		System.out.print("Enter the radius of your sphere. ");
		double sphereRadius = myScanObj.nextDouble();
		System.out.println("The volume is approximately " + ((4/3)*3.14*Math.pow(sphereRadius,3)) + " and the surface area is approximately " + (4*3.14*Math.pow(sphereRadius,2)) + ".");

		//4
		System.out.print("In dollars & cents, how much was your meal? $");
		double cost = myScanObj.nextDouble();
		System.out.println("Your tip should be $" + (cost*.15) + ", for a total of $" + ((cost*.15)+cost) + ".");

		//3
		System.out.print("Enter the radius of the circle. ");
		int circleRadius = myScanObj.nextInt();
		System.out.println("The diameter is " + circleRadius*2 + ".");

		//2
		System.out.print("Enter a number with a decimal. ");
		double doubleOne = myScanObj.nextDouble();
		System.out.print("Enter a number with a decimal. ");
		double doubleTwo = myScanObj.nextDouble();
		System.out.println("The sum is " + (doubleOne+doubleTwo) + ", the  difference is " + (doubleOne-doubleTwo) + ", the product is " + (doubleOne*doubleTwo) + ", and the remainder is " + (doubleOne%doubleTwo) + ".");

		//1
		System.out.print("Enter an integer. ");
		int intOne = myScanObj.nextInt();
		System.out.print("Enter an integer. ");
		int intTwo = myScanObj.nextInt();
		System.out.print("Enter an integer. ");
		int intThree = myScanObj.nextInt();
		System.out.print("The average is " + (intOne+intTwo+intThree)/3);
	}
}