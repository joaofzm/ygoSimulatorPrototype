package br.com.joaofzm15.astral.domain.card.monster;

import br.com.joaofzm15.astral.domain.card.Card;
import br.com.joaofzm15.astral.domain.card.monster.enums.Attribute;
import br.com.joaofzm15.astral.domain.card.monster.enums.Type;

public abstract class Monster extends Card {

	private Attribute attribute;
	private Type type;
	private int attack;
	
}
