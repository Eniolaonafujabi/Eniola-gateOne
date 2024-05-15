import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
public class EcommerceCheckoutSystem{

	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		ArrayList<Double> priceOfGoods = new ArrayList<Double>();
		ArrayList<Integer> piecesOfGoods = new ArrayList<Integer>();
		ArrayList<String> itemOfGoods = new ArrayList<String>();
		ArrayList<Double> total = new ArrayList<Double>();
		
		String addressandtime = """
		Semicolon Stores Main Branch
		Location: 312, Herbert Macaulay Way, Sabo Yaba, Lagos.
		Tel: 08146997803
		""";
		 Date today = new Date();

		String name = null;

		double addedValue = 0.0;
		boolean addMoreItem = true;
		String cashierName = null;
		double howMuchDiscountGiven = 0;
		
		System.out.println("What is the customer's name: ");
		name = collector.nextLine();
		System.out.println();

		int count = 0;
		for(; addMoreItem != false; count++){
			System.out.println("What did the user buy? ");
			 itemOfGoods.add(collector.next());
			
			System.out.println("How many pieces: ");
				piecesOfGoods.add(collector.nextInt());
			
			System.out.println("How much per unit: ");
				priceOfGoods.add(collector.nextDouble());
			
			System.out.println("Do you want to add more item true/false: ");
				addMoreItem = collector.nextBoolean();
		}
		System.out.println("What is Cashier name: ");
 		cashierName = collector.next();
		
		System.out.println("How much discount will he get ");
		howMuchDiscountGiven = collector.nextDouble();
		
		int counter = 0;
		for(; counter<count;counter++){
			total.add(piecesOfGoods.get(counter) * priceOfGoods.get(counter));
			addedValue = addedValue + total.get(counter);	
		}

		double discount = addedValue * howMuchDiscountGiven / 100;
		double vat = addedValue * 7.5 / 100;
		double billTotal = (addedValue - discount) + vat;

		System.out.println(addressandtime);
		System.out.println(today);
		System.out.println("Cashier name: " + cashierName);
		System.out.println("Customer name: "+name);
		System.out.println("===========================================");
		System.out.println("	ITEM	OTY	PRICE	TOTAL(NGN)");
		System.out.println("------------------------------------------------");
		int counter1 = 0;
		for(; counter1<count;counter1++){
			System.out.printf("	%s	%d	%.2f	%.2f%n", itemOfGoods.get(counter1), piecesOfGoods.get(counter1),priceOfGoods.get(counter1),total.get(counter1));
		}
		System.out.println("------------------------------------------------");

		System.out.printf("%nSub Total: %.2f%nDiscount: %.2f%nVat@7.5: %.2f%n", addedValue,discount,vat);
		
		System.out.println("===========================================");

		System.out.printf("Bill Total: %f%n", billTotal);	

		System.out.println("===========================================");
		System.out.printf("This is not a recipt please kindly pay: %.2f%n", billTotal);

		System.out.println("===========================================");

		System.out.println("How much did you collect: ");
		double amountCollected = collector.nextDouble();

		double changeToBeGiven = Katta.subtract(amountCollected,billTotal);
		
		System.out.println(addressandtime);
		System.out.println(today);
		System.out.println("Cashier name: " + cashierName);
		System.out.println("Customer name: "+name);
		System.out.println("===========================================");
		System.out.println("	ITEM	OTY	PRICE	TOTAL(NGN)");
		System.out.println("------------------------------------------------");
		int counter3 = 0;
		for(; counter3<count;counter3++){
			System.out.printf("	%s	%d	%.2f	%.2f%n", itemOfGoods.get(counter3), piecesOfGoods.get(counter3),priceOfGoods.get(counter3),total.get(counter3));
		}
		System.out.println("------------------------------------------------");
		
		System.out.printf("%nSub Total: %.2f%nDiscount: %.2f%nVat@7.5: %.2f%n", addedValue,discount,vat);
		System.out.println("===========================================");

		System.out.printf("Bill Total: %.2f%nAmount Paid: %.2f%nBalance: %.2f%n", billTotal,amountCollected,changeToBeGiven);	
		System.out.println("===========================================");	
		System.out.println("Thank You For Your Pantronage!!!!!!!!");
		System.out.println("===========================================");
		

	
	



	}
}