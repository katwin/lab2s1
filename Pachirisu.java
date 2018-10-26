package kat.win;

import ru.ifmo.se.pokemon.Pokemon;

public class Pachirisu extends Pokemon {
    public Pachirisu(String name, int level) {
        super(name, level);
        this.setStats(60D, 45D,70D,45D,90D,95D);
        this.setMove(new Facade(), new QuickAttack(), new FakeTears(), new Swift());
    }
}
