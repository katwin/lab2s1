package kat.win;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90D, 1.0D);
    }
    protected void applyEffects (Pokemon p) {
        if (Math.random()<0.1)p.setMod(Stat.SPECIAL_DEFENSE,-1);
    }
}

