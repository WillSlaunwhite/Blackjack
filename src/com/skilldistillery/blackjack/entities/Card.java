package com.skilldistillery.blackjack.entities;

import java.util.Objects;

//Rank and Suit are available in the solutions.cards package. Use them to create the classes in these labs. Be sure to copy-paste them into the package where you create your new classes.
//
//Create a class called Card.
//
//A card has a Suit and Rank. Set these in the constructor.
//Generate the methods hashCode and equals
//Add a toString which says rank + " of " + suit.
//Add a method getValue to return the card's numeric value.
//(Solution: Card.java)
//
//Write a program to ask a user how many cards they want.
//
//Handle the case where users enter a non-integer or a number greater than 52: print an error message.
//Deal the cards and display them on the screen. Also display the total value of all cards.
//
//(Solution: Dealing.java)


public class Card {
	private Suit suit;
	private Rank rank;
	
	public Card() {}
	public Card(Rank rank, Suit suit) {
		this.suit = suit;
		this.rank = rank;
	}
	
	
	public int getValue(Card card) {
		return card.rank.getValue();
	}
	
	@Override
	public String toString() {
		return rank + " of " + suit;
	}
	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}
	
}
