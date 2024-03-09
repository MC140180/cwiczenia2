package cwiczenie_1;

import java.util.Objects;

public class GunnerWeaponStrategy implements IWeaponSelection{
    @Override
    public boolean checkRoleOfWeapon(IWeapon weapon) {
        if(!(weapon.getHero() instanceof Gunner)){
            System.out.println("to nie jest bron dla Ciebie");
        }
        return (weapon.getHero() instanceof Gunner);
    }
}
