package kat.win;

import ru.ifmo.se.pokemon.Pokemon;

public class Tangela extends Pokemon {
    public Tangela(String name, int level) {
        super(name, level);
        this.setStats(65D, 55D, 115D, 100D, 40D, 60D);
        this.setMove(new Absorb(), new EnergyBall(), new Tickle());
    }
}
