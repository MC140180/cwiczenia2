package cwiczenie_1;

import java.util.Objects;

public class ShooterSelectionStrategy implements IWeaponSelection {
    @Override
    public boolean checkRoleOfWeapon(IWeapon weapon) {
        if(!(weapon.getHero() instanceof Shooter)){
            System.out.println("to nie jest bron dla Ciebie");
        }
        return (weapon.getHero() instanceof Shooter);
    }
}
