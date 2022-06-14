package br.com.joaofzm15.astral.domain.duelist;

import br.com.joaofzm15.astral.domain.deck.Deck;
import br.com.joaofzm15.astral.domain.user.User;

public class Duelist {

	private Deck deck;
	
	private int lp;
	
	public Duelist(User user, int i) {
		deck = user.getDecks().get(i);
		lp = 8000;
	}

}
