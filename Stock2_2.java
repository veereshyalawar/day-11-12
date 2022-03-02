
import java.util.ArrayList;
import java.util.Scanner;

public class Stock2_2 {

	ArrayList<String> stockName = new ArrayList<String>(); // individual ArraylistList to store n number of data
	ArrayList<Integer> numberOfShares = new ArrayList<Integer>();
	ArrayList<Integer> sharePrice = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	int balance = 1000; // inital account balance

	public void addStocks() {

		System.out.print("Enter the stock name: "); // taking user input
		stockName.add(sc.next());

		System.out.print("Enter number of shares : ");
		numberOfShares.add(sc.nextInt());

		System.out.print("Enter price of each share: ");
		sharePrice.add(sc.nextInt());

	}

	public void stockReport() {

		/*
		 * here we are calculating value of stock price
		 */

		int sum = 0;
		System.out.println("***************STOCK REPORT****************");

		for (int i = 0; i < stockName.size(); i++) {
			int total = (numberOfShares.get(i) * sharePrice.get(i));
			balance = balance - total;
			sum = sum + total;
			System.out.println("Stock name= " + stockName.get(i) + "\nValue of each share= " + sharePrice.get(i)
					+ "\nTotal value of share= " + total);
			System.out.println(" Balance remaining : " + balance);
		}

	}

	public void debit() {
		System.out.println("Enter the amount you want to withdraw: ");
		int withdraw = sc.nextInt();
		if (withdraw < balance) {
			balance = balance - withdraw;
			System.out.println("Debit is succesful of amount :" + withdraw);
			System.out.println("Total amount left after withdrawal= " + balance);
		} else
			System.out.println("Debit amount exceeded account balance");
	}

}