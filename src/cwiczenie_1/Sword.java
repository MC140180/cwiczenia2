package cwiczenie_1;

public class Sword extends Weapon {
    public Sword() {
        this.hero = new Knight();
    }

    @Override
    public void attack() {
        System.out.println("Sword attack");
    }
}
