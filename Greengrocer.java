package java101;

import java.util.Scanner;

public class Greengrocer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double pear, apple, tomatoes, banana, eggplant, total;

		System.out.print(" How many kilograms is a pear?: ");
		pear = input.nextDouble();
		System.out.print(" How many kilograms is an apple?: ");
		apple = input.nextDouble();
		System.out.print(" How many kilograms is a tomatoes?: ");
		tomatoes = input.nextDouble();
		System.out.print(" How many kilograms is a banana?: ");
		banana = input.nextDouble();
		System.out.print(" How many kilograms is a eggplant?: ");
		eggplant = input.nextDouble();

		total = (pear * 2.14) + (apple * 3.67) + (tomatoes * 1.11) + (banana * 0.95) + (eggplant * 5.0);
		System.out.print(" Toplam tutar= " + total);

	}

}
