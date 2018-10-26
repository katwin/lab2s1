package kat.win;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 1.0D);
    }
    protected void applyEffects (Pokemon p) {
        Status st = p.getCondition();
        if (st.equals(Status.BURN) || st.equals(Status.POISON) || st.equals(Status.PARALYZE)) {
            this.power = power*2;
        }
    }
}
