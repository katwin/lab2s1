package kat.win;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pachirisu("Салават", 500);
        Pokemon p2 = new Poliwag("Сюмбель", 75);
        Pokemon p3 = new Poliwhirl("Ринат", 50);
        Pokemon p4 = new Politoed("Искандер", 80);
        Pokemon p5 = new Tangela("Шамиль", 77);
        Pokemon p6 = new Tangrowth("Зухра", 66);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
