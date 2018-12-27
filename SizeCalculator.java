/*Kathleen Hardy
 * Section 324
 Lab teacher: Jason Mombourquette*/

import java.text.DecimalFormat;
public class SizeCalculator {
	
	private Box firstBox, secondBox;
	DecimalFormat df;
	private String message;
	
	
	SizeCalculator(){
		System.out.println("Size calculator - we speak volumes\n");
		firstBox = new Box();
		secondBox = new Box();
		message = "";
		df = new DecimalFormat("#.##");
		
		
	}
	private void inputBox(Box aBox) {
		aBox.inputLength();
		aBox.inputWidth();
		aBox.inputHeight();
	}
	
	public void inputBoxes() {
		System.out.println("Enter first box dimensions");
		this.inputBox(firstBox);
		System.out.println("\nEnter second box dimensions");
		this.inputBox(secondBox);
		System.out.println();
		
	}
	
	public void calculateSizes() {
		double firstVolume = firstBox.calcVolume();
		double secondVolume = secondBox.calcVolume();
		

		if (firstVolume == secondVolume) {
			message = "The first box is the same size as the second box";
		}
		

		else {
			if(firstVolume > secondVolume) {
				double multiple = firstVolume/secondVolume;
				if (multiple<2) 
					message = "The first box is slightly bigger than the second box";
				else if (multiple >=2 && multiple <3)
						message = "The first box is twice the size of the second box";
				else if (multiple >=3 && multiple < 4)
					message = "The first box is triple the size of the second box";
				else if (multiple>=4 && multiple < 5)
					message = "The first box is quadruple the size of the second box";
				else
						message = "The first box is " + df.format(multiple)+ " times the size of the second box";

			}
			else {
				double multiple = secondVolume/firstVolume;
				if (multiple<2) 
					message = "The second box is slightly bigger than the first box";
				else if (multiple >=2 && multiple <3)
						message = "The second box is twice the size of the first box";
				else if (multiple >=3 && multiple < 4)
					message = "The second box is triple the size of the first box";
				else if (multiple>=4 && multiple < 5)
					message = "The second box is quadruple the size of the first box";
				else
					message = "The second box is " + df.format(secondVolume/firstVolume) + " times bigger than the first box";
			}
		}	
	}
	
	public void display() {
		firstBox.displayDimension();
		secondBox.displayDimension();
		System.out.print(message);
		
	}

}
