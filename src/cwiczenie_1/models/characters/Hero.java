package cwiczenie_1.models.characters;

import cwiczenie_1.interfaces.IWeapon;
import cwiczenie_1.interfaces.IWeaponSelection;

public abstract class Hero  {
    protected IWeaponSelection weaponSelectionStrategy;
    protected IWeapon currentWeapon;

    public IWeapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(IWeapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    Hero(IWeaponSelection weaponSelectionStrategy) {
        this.weaponSelectionStrategy = weaponSelectionStrategy;
    }

    public void selectWeapon(IWeapon weapon) {
        if (!weaponSelectionStrategy.checkRoleOfWeapon(weapon)) {
            return;
        }
        this.currentWeapon = weapon;
        System.out.println("Wybrano broń");
    }
}
