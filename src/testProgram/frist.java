package testProgram;

import java.util.Scanner;

public class frist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		float h = input.nextFloat() / 100;
		float w = input.nextFloat();

		float bmi = w / (h * h);

		System.out.println(String.format("%.2f", bmi));

	}

}
 	