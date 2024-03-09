package cwiczenie_1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Archer extends Hero implements IHero {
    public Archer() {
        super(new ArcherWeaponStrategy());
    }

    @Override
    public ArrayList<IWeapon> GetAvailableWeapons() {
        return AvailableWeapons.GetAvailableWeapons().stream()
                .filter(s -> s.getHero() instanceof Archer)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
