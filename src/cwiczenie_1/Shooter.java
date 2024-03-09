package cwiczenie_1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Shooter extends Hero implements IHero {
    public Shooter() {
        super(new ShooterSelectionStrategy());
    }

    @Override
    public ArrayList<IWeapon> GetAvailableWeapons() {
        return AvailableWeapons.GetAvailableWeapons().stream()
                .filter(s -> s.getHero() instanceof Shooter)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
