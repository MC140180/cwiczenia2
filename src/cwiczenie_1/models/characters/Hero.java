package cwiczenie_1.models.characters;

import cwiczenie_1.enums.VocationEnum;
import cwiczenie_1.interfaces.IHero;
import cwiczenie_1.interfaces.IWeapon;

public abstract class Hero implements IHero {
    protected IWeapon currentWeapon;
    protected final VocationEnum myRoleEnum;


    Hero(VocationEnum vocationEnum) {
        this.myRoleEnum = vocationEnum;
    }

    @Override
    public void selectWeapon(IWeapon weapon) {
        if (!(weapon.getAvailableVocationToUse() == this.getMyRoleAsEnum())) {
            System.out.println("to nie jest bron dla Ciebie");
            return;
        }
        this.setCurrentWeapon(weapon) ;
        System.out.println("Wybrano broń");
    }

    @Override
    public VocationEnum getMyRoleAsEnum() {
        return this.myRoleEnum;
    }


    public IWeapon getCurrentWeapon() {
        return currentWeapon;
    }

    private void setCurrentWeapon(IWeapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }
}
