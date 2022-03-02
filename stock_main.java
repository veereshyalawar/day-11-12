
import java.util.ArrayList;
import java.util.Scanner;

public class stock_main {
	ArrayList<stocks> arrayList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		stock_main sa = new stock_main();
		System.out.println("Welcome to stocks management");
		while(true) {
			System.out.println("!!! select number !!! \n1)Add new stocks \n2)Display Stocks report "
					+ "\n3)exit");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1->sa.addStockss();
			case 2->sa.stocksReport();
			case 3->{System.out.println("exiting");
					 System.exit(0);}
			default->System.out.println("invalid input");
			}
		}
	}
	
	public void addStockss() {
		stocks stocks = new stocks();
		System.out.println("Enter the stocks name");
		stocks.setStockNames(scanner.next());
		
		System.out.println("Enter the number of shares present");
		stocks.setNumOfShare(scanner.nextDouble());
		
		System.out.println("Enter the share price");
		stocks.setSharePrice(scanner.nextDouble());
		
		
		arrayList.add(stocks);
	}
	
	public void stocksReport() {
		Double sum =0.0;
		System.out.println("****** STOCK REPORT ******");
		for(int i =0;i<arrayList.size();i++) {
			stocks s = arrayList.get(i);
			double totalPrice = s.getNumOfShare()*s.getSharePrice();
			totalPrice = sum+totalPrice;
			System.out.println("stocks name = "+s.getStockNames()+"\nnumber of shares = "+s.getNumOfShare()+"\nstocks price = "+s.getSharePrice()+"\nTotal price of stocks = "+totalPrice+"\n");
			}
	}

}