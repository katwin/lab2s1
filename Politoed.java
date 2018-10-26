package kat.win;

public class Politoed extends Poliwhirl {
    public Politoed(String name, int level) {
        super(name, level);
        this.setStats(90D,75D,75D,90D,100D,70D);
        this.setMove(new Swagger(), new Waterfall(), new BodySlam());
    }
}
