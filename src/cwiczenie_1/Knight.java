package cwiczenie_1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Knight extends Hero implements IHero {

    public Knight() {
        super(new KnightSelectionStrategy());
    }

    @Override
    public ArrayList<IWeapon> GetAvailableWeapons() {
        return AvailableWeapons.GetAvailableWeapons().stream()
                .filter(s -> s.getHero() instanceof Knight)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
