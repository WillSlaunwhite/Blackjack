package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Shoe {
// takes in and stores decks based on game
// someday maybe we just pass in game name and it adds a 
// random number of decks by itself. 
	
//	shoes seem like they just hold the shuffled cards
//	of 2,4,6, or 8 decks. there's a marker somewhere in 
//	the deck indicating when it needs to be shuffled.
	
//	you know, i might make deck abstract and say shoe extends 
//	deck. then i can make deck classes for other games? maybe? 
//	alternatively i move decks functionality to Shoe as well.
	List<Card> fullCardList = new ArrayList<>();
	
	public Shoe() {}
	public Shoe(List<Card> listOfCards) {
		for(Card card : listOfCards) {
			fullCardList.add(card);
		}
	}
	
	
}
