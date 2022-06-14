package br.com.joaofzm15.astral.domain.card.monster;

import br.com.joaofzm15.astral.domain.card.Effect;
import br.com.joaofzm15.astral.domain.card.Effects;
import br.com.joaofzm15.astral.domain.duel.Duel;
import br.com.joaofzm15.astral.domain.duelist.Duelist;

public abstract class EffectMonster extends Monster {

	private Effect effect;
	
	private void activateEffect(Duel duel, Duelist duelist) {
		Effects.filter(duel, duelist, effect);
	}

}
