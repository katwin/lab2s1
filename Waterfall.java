package kat.win;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove {
    public Waterfall() {
        super(Type.WATER, 80D, 1.0D);
    }
    protected void applyEffects (Pokemon p) {
        Effect ef = new Effect();
        ef.chance(0.2D);
        Effect.flinch(p);
    }
}
