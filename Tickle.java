package kat.win;

import ru.ifmo.se.pokemon.*;

public class Tickle extends StatusMove {
    public Tickle() {
        super();
        this.type = Type.NORMAL;
        this.accuracy = 1.0D;
    }
    protected void applyEffects (Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK,-1);
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
}
