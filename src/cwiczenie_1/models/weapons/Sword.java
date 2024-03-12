package cwiczenie_1.models.weapons;

import cwiczenie_1.models.characters.Knight;

public class Sword extends Weapon {
    public Sword() {
        this.hero = new Knight();
    }

    @Override
    public void attack() {
        System.out.println("Sword attack");
    }
}
