package kat.win;

import ru.ifmo.se.pokemon.*;

public class FakeTears extends StatusMove {
    public FakeTears() {
        super();
        this.type = Type.DARK;
        this.accuracy = 1.0D;
    }
    protected void applyEffects (Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE,-1);
    }
}
