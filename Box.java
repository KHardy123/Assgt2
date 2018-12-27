/*Kathleen Hardy
 * Section 324
 Lab teacher: Jason Mombourquette*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Box {
	private double length, width, height;
	private Scanner input;
	
	Box() {
		length = 0;
		width = 0;
		height = 0;
		input = new Scanner(System.in);
	}

	Box(double aLength, double aWidth, double aHeight) {
		length = aLength;
		width = aWidth;
		height = aHeight;
		input = new Scanner(System.in);
		
	}
	
	Box(Box aBox){
		length = aBox.length;
		width = aBox.width;
		height = aBox.height;
		input = new Scanner(System.in);		
	}
	
	public void inputLength() {
		System.out.print("Enter length:");
		length = input.nextDouble();		
	}
	
	public void inputWidth() {
		System.out.print("Enter width:");
		width = input.nextDouble();	
	}
	
	public void inputHeight() {
		System.out.print("Enter height:");
		height = input.nextDouble();	
	}
	
	public double calcVolume() {
		return length*width*height;	
	}
	
	public void displayDimension() {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(length + " X " + width + " X " + height + " volume="+ df.format(length*width*height));
	}

}
