package cwiczenie_1.models.characters;

import cwiczenie_1.AvailableWeapons;
import cwiczenie_1.weaponSelectors.KnightWeaponSelection;
import cwiczenie_1.interfaces.IHero;
import cwiczenie_1.interfaces.IWeapon;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Knight extends Hero implements IHero {

    public Knight() {
        super(new KnightWeaponSelection());
    }

    @Override
    public ArrayList<IWeapon> GetAvailableWeapons() {
        return AvailableWeapons.GetAvailableWeapons().stream()
                .filter(s -> s.getHero() instanceof Knight)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
