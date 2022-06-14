package br.com.joaofzm15.astral.domain.duel;

import br.com.joaofzm15.astral.domain.card.Card;
import br.com.joaofzm15.astral.domain.deck.Deck;
import br.com.joaofzm15.astral.domain.duelist.Duelist;
import br.com.joaofzm15.astral.domain.user.User;

public class Duel {
	
	private Duelist duelist1;
	private Duelist duelist2;
	
	public Duel(User u1, int u1Deck, User u2, int u2Deck) {
		duelist1= new Duelist(u1, u1Deck);
		duelist2= new Duelist(u2, u2Deck);
	}
	

	private void activateEffect(Card card, Duelist p) {
		
	}

}
