package cwiczenie_1.weaponSelectors;

import cwiczenie_1.interfaces.IWeapon;
import cwiczenie_1.interfaces.IWeaponSelection;
import cwiczenie_1.models.characters.Knight;

public class KnightWeaponSelection implements IWeaponSelection {
    @Override
    public boolean checkRoleOfWeapon(IWeapon weapon) {
        if(!(weapon.getHero() instanceof Knight)){
            System.out.println("to nie jest bron dla Ciebie");
        }
        return (weapon.getHero() instanceof Knight);
    }
}