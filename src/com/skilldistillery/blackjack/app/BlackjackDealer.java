package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entities.Dealer;

public class BlackjackDealer extends Dealer {
//	taking some of the functionality from deck and giving 
//	it to dealer and bjdealer instead. this is in preparation 
//	to eventually use a shoe. since dealer will have this 
//	functionality, he'll need to be passed in a deck and 
//	later a shoe.

	BlackjackHand hand = new BlackjackHand();

	public BlackjackDealer() {
	}

	public boolean hitOrStand() {
		if (this.hand.getHandValue() < 17) {
			System.out.println("Dealer hits");
			return true;
		} else {
			System.out.println("Dealer stands");
			return false;
		}
	}

	public String hiddenToString() {
		int i=0;
		String[] secretHand = hand.toString().split(" ");
		String secretHandString = "";
		for(String str : secretHand) {
			secretHandString += str + " ";
			if(i == (secretHand.length - 4)) {
				break;
			}
			i++;
		}
		return secretHandString;
	}

	public void displayHiddenHand() {
//			String[] secretHand = hand.toString().split("(\\d\\s\\D{2}\\s\\D{4,8})");
//			for(String str : secretHand) {
//				System.out.println(str);
//			}
		String[] secretHand = hand.toString().split(" ");
		while (secretHand.length > 3) {
			System.out.println(secretHand[0] + " " + secretHand[1] + " " + secretHand[2]);
			
		}
	}

}
