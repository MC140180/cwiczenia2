package cwiczenie_1.models.weapons;

import cwiczenie_1.interfaces.IWeapon;
import cwiczenie_1.models.characters.Hero;

public abstract class Weapon implements IWeapon {
    protected Hero hero;

    @Override
    public Hero getHero() {
        return this.hero;
    }
}
