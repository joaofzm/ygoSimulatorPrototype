package br.com.joaofzm15.astral.domain.user;

import java.util.ArrayList;
import java.util.List;

import br.com.joaofzm15.astral.domain.deck.Deck;

public class User {

	private String name;
	
	private List<Deck> decks = new ArrayList<>();

	public List<Deck> getDecks() {
		return decks;
	}

}
