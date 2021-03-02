package booleanTests;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.95;
		double moneyInWallet = 20.00;
		int thirstLevel = 5;
		
		boolean shouldBuyIcecream = isHotOutside == true && hasMoneyInPocket == true;
		boolean willGoSwimming = isHotOutside == true && isWeekday == false;
		boolean isAGoodDay = isHotOutside==true && isWeekday==false && hasMoneyInPocket==true;
		boolean willBuyMilk = isHotOutside==true && thirstLevel>=3 && moneyInWallet >= (2*costOfMilk);
		
		System.out.println(shouldBuyIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
	}

}
