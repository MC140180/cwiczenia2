package cwiczenie_1;

public abstract class Hero  {
    protected IWeaponSelection weaponSelectionStrategy;
    protected IWeapon currentWeapon;

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
