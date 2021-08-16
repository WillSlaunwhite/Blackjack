package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class BlackjackApp {
	public static void main(String[] args) {
		BlackjackApp bj = new BlackjackApp();
		bj.launch();
	}

	public void launch() {
		Deck mainDeck = new Deck();
		Scanner sc = new Scanner(System.in);
		BlackjackHand yourHand = new BlackjackHand();
		BlackjackDealer dealer = new BlackjackDealer();
		mainDeck.shuffle();
		
		yourHand.dealBlackjackHand(mainDeck);
		dealer.hand.dealBlackjackHand(mainDeck);

		if(yourHand.isBlackjack()) {
			System.out.println("You got blackjack!");
			launch();
		}
		else if(dealer.hand.isBlackjack()) {
			System.out.println("Dealer got blackjack!");
			launch();
		}
		
		while(true) {
			
			System.out.println("Your cards: " + yourHand.toString());
			System.out.println("Dealer's cards: " + dealer.hiddenToString());
			System.out.println("\n1. Hit or 2. Stand?\n");
			
			int input = sc.nextInt();
			
			if(input==1) { 
				Card tempCard = mainDeck.dealCard();
				System.out.println("You hit " + tempCard.toString());
				yourHand.addCard(tempCard);
				
				if(yourHand.isBust()) {
					System.out.println("You bust! Dealer wins!");
					break;
				}
				else {
					continue;
				}
				
			}
			
			while(dealer.hitOrStand()) {
				
				Card tempCard = mainDeck.dealCard();
				
				dealer.hand.addCard(tempCard);
				System.out.println(tempCard.toString());
				
				if(dealer.hand.isBust()) {
					System.out.println("\n" + dealer.hand.toString() + "\nDealer bust! You Win");
					break;
				}
				else {
					continue;
				}
				
			}
			
			if(dealer.hand.isBust() || yourHand.isBust()) {
				yourHand.clear();
				yourHand.dealBlackjackHand(mainDeck);
				dealer.hand.clear();
				dealer.hand.dealBlackjackHand(mainDeck);
				break;
				
			}
			
			System.out.println("Dealer's cards: " + dealer.hand.toString() + "\tValue: " + dealer.hand.getHandValue());
			
			if(yourHand.getHandValue() > dealer.hand.getHandValue()) {
				System.out.println("You win!\n");
				yourHand.clear();
				yourHand.dealBlackjackHand(mainDeck);
				dealer.hand.clear();
				dealer.hand.dealBlackjackHand(mainDeck);
				continue;
			}
			else if(yourHand.getHandValue() < dealer.hand.getHandValue()) {
				System.out.println("Dealer wins!\n");
				yourHand.clear();
				yourHand.dealBlackjackHand(mainDeck);
				dealer.hand.clear();
				dealer.hand.dealBlackjackHand(mainDeck);
				continue;
			}
			else {
				System.out.println("It's a draw!\n");
				yourHand.clear();
				yourHand.dealBlackjackHand(mainDeck);
				dealer.hand.clear();
				dealer.hand.dealBlackjackHand(mainDeck);
				continue;
			}
			
				
			
		}
			
			
			
			
			sc.close();
		
		
	}

	
	
}
