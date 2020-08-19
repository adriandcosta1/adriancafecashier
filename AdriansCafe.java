

import java.util.Scanner;
import java.util.Formatter;
import java.util.Locale;
import java.util.Arrays;
public class AdriansCafe{
public static void main(String[] args){
String answer = "n";
String answerStr = "n";
String[] coffeeTypes = new String[]{"Cafe Mocca", "Cappuccino", "Cafe Late"};
double[] coffeePrices = new double[]{2.30, 4.50, 3.00};
double milkPrice = 0.10;
double sugarPrice = 0.05;
char answerCoffee = 'n';
String answerMilk = "n";
String answerSugar = "n";
int milkNum = 0;
int sugarNum = 0;
double total = 0.0;
int coffeeTypeNum=0;
Scanner in = new Scanner(System.in);
String str = "n";
char lowerCase = 'n';
int milkNum2 = 0;
int sugarNum2 = 0;
do{
	do{
		System.out.println("Choose a coffee type:");
		for(int i = 0; i < coffeeTypes.length; ++i){
			System.out.println((i + 1) + ") " + coffeeTypes[i]);
		}
		coffeeTypeNum = in.nextInt();
		coffeeTypeNum--;
		if((coffeeTypeNum < 0) || (coffeeTypeNum >= coffeeTypes.length)){
			System.out.println("Try Again.");
		}

	}while(!((coffeeTypeNum >= 0) && (coffeeTypeNum < coffeeTypes.length)));

total += coffeePrices[coffeeTypeNum];
do{

    	System.out.print("How many milk do you want? ");
   	 milkNum2 = in.nextInt();
	milkNum += milkNum2;
	System.out.println();
	System.out.print("Are you sure you want to add more milk?");
	answerMilk = in.next();
	str = answerMilk.trim();
	lowerCase = str.charAt(0);
	
}while(lowerCase== 'y');
total += (milkNum * milkPrice);
do{

   	 System.out.print("How many sugar do you want? ");
  	 sugarNum2 = in.nextInt();
	sugarNum += sugarNum2;
	System.out.println();
	System.out.print("Are you sure you want to add more sugar?");
               answerSugar = in.next();
	str = answerSugar.trim();
	lowerCase = answerSugar.charAt(0);
	
}while(lowerCase=='y');
total += (sugarNum * sugarPrice);
StringBuilder sb = new StringBuilder();
   // Send all output to the Appendable object sb
   Formatter formatter = new Formatter(sb, Locale.US);
	
	System.out.printf("%-30s%-10f\n", coffeeTypes[coffeeTypeNum], coffeePrices[coffeeTypeNum]);
	
	System.out.printf("%-20s%-10d%-10f\n", "Num of Milks: ", milkNum, milkNum * milkPrice);
	System.out.printf("%-20s%-10s%-10f\n",   "Num of Sugars: " , sugarNum , sugarNum * sugarPrice);

	System.out.printf("%-30s%-10f\n", "Subtotal: ", total * 0.15);
	System.out.printf("%-100s\n", "---------------------------------------------------------------------");
	System.out.printf("%-30s%-10f\n", "Total: ", (total + (total * 0.15)));
	System.out.printf("%-50s\n", "Do you want to create another order?");
	answer = in.next();
	str = answer.trim();
	lowerCase = answer.charAt(0);
}while(!(lowerCase=='n'));

}
}