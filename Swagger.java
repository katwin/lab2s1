package kat.win;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove {
    public Swagger() {
        super();
        this.type = Type.NORMAL;
        this.accuracy = 0.85D;
    }
    protected void applyEffects (Pokemon p) {
        Effect ef = new Effect();
        p.confuse();
        ef.attack(Math.random()*6);
    }
}
