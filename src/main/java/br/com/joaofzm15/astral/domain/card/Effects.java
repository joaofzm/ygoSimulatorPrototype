package br.com.joaofzm15.astral.domain.card;

import br.com.joaofzm15.astral.domain.duel.Duel;
import br.com.joaofzm15.astral.domain.duelist.Duelist;

public class Effects {
	
	public static void filter(Duel duel, Duelist duelist, Effect effect) {
		if (effect.equals(Effect.draw1)) {
			draw1(duel, duelist);
		}
	}

	public static void draw1(Duel duel, Duelist duelist) {
		
	}
}
