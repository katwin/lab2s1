package kat.win;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND, 60D, 1.0D);
    }
    protected void applyEffects (Pokemon p) {
        Effect ef = new Effect();
        int i = (int)(Math.random()*6);
        p.setMod(Stat.SPEED, +i);
    }
}
