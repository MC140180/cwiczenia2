package cwiczenie_1;

public abstract class Weapon implements IWeapon {
    protected Hero hero;

    @Override
    public Hero getHero() {
        return this.hero;
    }
}
