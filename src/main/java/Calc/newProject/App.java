package Calc.newProject;

import java.util.*;

class Calcmethod {

	float total = 0;

	void information() {
		System.out.println("        PLEASE READ IT CAREFULLY :)        ");
		System.out.println("This is exactly works the way calculator.");
		System.out.println("Please press the operator that you want to apply or ex (+, - , * , / )");
		System.out.println();
		System.out.println();
	}

	void clear() {
		total = 0;
		System.out.println(total);
	}

	void multi(float x, float y) {
		total = x * y;
		System.out.println(total);
	}
	void multi(float y) {
		total = total * y;
		System.out.println(total);
	}

	void add(float x, float y) {
		total = x + y;
		System.out.println(total);
	}
	void add(float y) {
		total = total + y;
		System.out.println(total);
	}

	void sub(float x, float y) {
		total = x - y;
		System.out.println(total);
	}
	void sub(float y) {
		total = total - y;
		System.out.println(total);
	}

	void devide(float x, float y) {
		total = x / y;
		System.out.println(total);
	}
	void devide(float y) {
		total = total / y;
		System.out.println(total);
	}
}

public class App {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		Calcmethod calc = new Calcmethod();
		System.out.println("Enter to start");
		user.nextLine();
		float input_1;
		String input_2;
		float input_3;
		int s = 0;

//			float number= Float.parseFloat(input);
//			System.out.println(number);

		calc.information();
		System.out.println("Please Start using Calculator");

		input_1 = user.nextFloat();
		outerloop: do {
			try {
				System.out.println("Enter Assignment  :  ");
				input_2 = user.nextLine();

				switch (input_2) {
				case "*":
					if (s == 0) {
						input_3 = user.nextFloat();
						calc.multi(input_1, input_3);
						s++;
					} else {
						input_3 = user.nextFloat();
						calc.multi(input_3);
						s++;
					}break;
				case "+":
					if (s == 0) {
						input_3 = user.nextFloat();
						calc.add(input_1, input_3);
						s++;
					} else {
						input_3 = user.nextFloat();
						calc.add(input_3);
						s++;
					}break;
				case "-":
					if (s == 0) {
						input_3 = user.nextFloat();
						calc.sub(input_1, input_3);
						s++;
					} else {
						input_3 = user.nextFloat();
						calc.sub(input_3);
						s++;
					}break;
				case "/":
					if (s == 0) {
						input_3 = user.nextFloat();
						calc.devide(input_1, input_3);
						s++;
					} else {
						input_3 = user.nextFloat();
						calc.devide(input_3);
						s++;
					}break;
				case "exit":
					System.out.println("\t\t\tFINISHED");
					break outerloop;
				case "clear":
					System.out.println("It's Clear Now");
					calc.clear();
					s=0;
					System.out.print("Enter Number:  ");
					input_1 = user.nextFloat();
					break;
				}
			} catch (Exception E) {
				System.out.println("invalid Input Try again");
			}
		} while (true);
	}
}


