package com.skilldistillery.blackjack.entities;

import java.util.Objects;

public class Card {
	private Suit suit;
	private Rank rank;

	public Card() {
	}

	public Card(Rank rank, Suit suit) {
		this.suit = suit;
		this.rank = rank;
	}

	public int getValue(Card card) {
		return card.rank.getValue();
	}

	@Override
	public String toString() {
		if (rank.getValue() == 11) {
			return "Ace of " + suit;
		} else {
			return rank.getValue() + " of " + suit;
		}
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
