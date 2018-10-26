package kat.win;

public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int level) {
        super(name, level);
        this.setStats(65D,65D,65D,50D,50D,90D);
        this.setMove(new Waterfall(), new Swagger(), new BodySlam());
    }
}
