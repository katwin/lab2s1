package kat.win;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public Absorb() {
        super(Type.GRASS, 20D, 1.0D);
    }
    protected void applyEffects (Pokemon p) {
        Effect ef = new Effect();
        ef.stat(Stat.HP);
        p.addEffect(ef);
    }
}
