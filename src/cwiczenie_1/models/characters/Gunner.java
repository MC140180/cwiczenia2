package cwiczenie_1.models.characters;

import cwiczenie_1.AvailableWeapons;
import cwiczenie_1.weaponSelectors.GunnerWeaponSelection;
import cwiczenie_1.interfaces.IHero;
import cwiczenie_1.interfaces.IWeapon;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Gunner extends Hero implements IHero {
    Gunner(){
        super(new GunnerWeaponSelection());
    }
    @Override
    public ArrayList<IWeapon> GetAvailableWeapons() {
        return AvailableWeapons.GetAvailableWeapons().stream()
                .filter(s -> s.getHero() instanceof Gunner)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
