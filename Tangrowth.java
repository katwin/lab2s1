package kat.win;

public class Tangrowth extends Tangela {
    public Tangrowth(String name, int level) {
        super(name, level);
        this.setStats(100D,100D,125D,110D,50D,50D);
        this.setMove(new Absorb(), new EnergyBall(), new Tickle(), new Bulldoze());
    }
}
