package kat.win;

import ru.ifmo.se.pokemon.*;

public class BodySlam extends PhysicalMove {
    public BodySlam() {
        super(Type.NORMAL, 85D,1.0D);
    }
    protected void applyEffects (Pokemon p) {
        Effect ef = new Effect();
        int i = (int)(Math.random()*6);
        p.setMod(Stat.ATTACK, +i);
    }
}
