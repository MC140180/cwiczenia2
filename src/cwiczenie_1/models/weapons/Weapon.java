package cwiczenie_1.models.weapons;

import cwiczenie_1.enums.VocationEnum;
import cwiczenie_1.interfaces.IWeapon;
import cwiczenie_1.models.characters.Hero;

public abstract class Weapon implements IWeapon {
    protected final VocationEnum weaponFor;
    Weapon(VocationEnum vocationEnum){
        this.weaponFor = vocationEnum;
    }

    @Override
    public VocationEnum getAvailableVocationToUse() {
        return this.weaponFor;
    }
}
