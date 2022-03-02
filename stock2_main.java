import java.util.Scanner;

public class stock2_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stock2_2 obj = new Stock2_2();

		// making choice for input and calling methord with object in indivisual case
		while (true) {
			System.out.println("1-Enter New Stock \n2-Display Stock Report \n3-Withdraw Amount From Balance \n4-Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				obj.addStocks();
				break;
			case 2:
				obj.stockReport();
				break;
			case 3:
				obj.debit();
				break;
			case 4:
				System.out.println("Good Bye");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Input");
				break;

			}
		}
	}
}
