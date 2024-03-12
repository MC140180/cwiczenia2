package cwiczenie_1.models.characters;

import cwiczenie_1.weaponSelectors.ArcherWeaponSelection;
import cwiczenie_1.AvailableWeapons;
import cwiczenie_1.interfaces.IHero;
import cwiczenie_1.interfaces.IWeapon;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Archer extends Hero implements IHero {
    public Archer() {
        super(new ArcherWeaponSelection());
    }

    @Override
    public ArrayList<IWeapon> GetAvailableWeapons() {
        return AvailableWeapons.GetAvailableWeapons().stream()
                .filter(s -> s.getHero() instanceof Archer)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
