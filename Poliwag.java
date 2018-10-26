package kat.win;

import ru.ifmo.se.pokemon.Pokemon;

public class Poliwag extends Pokemon {
    public Poliwag (String name, int level) {
        super(name, level);
        this.setStats(40D,50D,40D,40D,40D,90D);
        this.setMove(new Waterfall(), new Swagger());
    }
}
