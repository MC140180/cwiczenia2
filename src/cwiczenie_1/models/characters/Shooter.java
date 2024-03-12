package cwiczenie_1.models.characters;

import cwiczenie_1.AvailableWeapons;
import cwiczenie_1.weaponSelectors.ShooterWeaponSelection;
import cwiczenie_1.interfaces.IHero;
import cwiczenie_1.interfaces.IWeapon;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Shooter extends Hero implements IHero {
    public Shooter() {
        super(new ShooterWeaponSelection());
    }

    @Override
    public ArrayList<IWeapon> GetAvailableWeapons() {
        return AvailableWeapons.GetAvailableWeapons().stream()
                .filter(s -> s.getHero() instanceof Shooter)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
