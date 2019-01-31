import java.util.Scanner;

public class TriangularVerification {

	static double square = 2.0;
	static double[] numbers = new double[3];

	public static class outputs {
		static void display_1() {
			System.out.println("Welcome to triangular numbers verificator application.");
		}

		static void display_2() {
			System.out.println("Triangular numbers confirmed. Kindly wait for exact type...");
		}
	}

	static void inputs() {

		Scanner in = new Scanner(System.in);
		{
			for (int i = 0; i < numbers.length; i++) {
				

				boolean isValid = false;
				while (isValid == false) {
					System.out.println("Enter a number");
					// If input is number execute this,
					if (in.hasNextDouble()) {
						numbers[i] = in.nextDouble();
						isValid = true;
						System.out.println("OK");
					}
					// If input is not a number execute this block,
					else  {
						System.out.println("Error! What you entered is not a number.");
					}
					in.nextLine();
				}
			}
		} 

		
	}

	static void verify_numbers() {

		while (numbers[0] <= 0 || numbers[1] < 0 || numbers[2] <= 0) {
			System.out.println("Invalid dimension(s) of triangle entered. Cannot be Zero or negative number. Start again.");
			inputs();
			verify_numbers();
			System.exit(0);
		}

		if (numbers[0] + numbers[1] > numbers[2] && numbers[0] + numbers[2] > numbers[1]
				&& numbers[1] + numbers[2] > numbers[0])

		{

			outputs.display_2();

			if (numbers[0] == numbers[1] && numbers[0] == numbers[2] && numbers[1] == numbers[2]) {
				System.out.println("This is an Equilaterial Triangle");
				System.out.println("Thanks for using this App.");
			}

			else if ((Math.pow(numbers[0], square) + Math.pow(numbers[1], square) == Math.pow(numbers[2], square)

					||

					Math.pow(numbers[0], square) + Math.pow(numbers[2], square) == Math.pow(numbers[1], square)

					||

					Math.pow(numbers[1], square) + Math.pow(numbers[2], square) == Math.pow(numbers[0], square)) &&

					(numbers[0] != numbers[1] || numbers[0] != numbers[2] || numbers[1] != numbers[2]))

			{

				System.out.println("This is a Right-Angled Triangle");
				System.out.println("Thanks for using this App.");

			}

			else if (numbers[0] != numbers[1] && numbers[0] != numbers[2] && numbers[1] != numbers[2]) {

				System.out.println("This is a Scalene Triangle");
				System.out.println("Thanks for using this App.");
			}

			else if (numbers[0] == numbers[1] || numbers[1] == numbers[2] || numbers[2] == numbers[0])

			{
				System.out.println("This is an Isosceles Triangle");
				System.out.println("Thanks for using this App.");
			}

		}

		else

		{
			System.out.println("Sorry! Your inputs are NOT triangular numbers. You may try again. App closed.");
			
		}

	}

	public static void main(String[] args) {

		outputs.display_1();

		inputs();

		verify_numbers();

	}

}
