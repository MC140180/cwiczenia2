package cwiczenie_1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Gunner extends Hero implements IHero {
    Gunner(){
        super(new GunnerWeaponStrategy());
    }
    @Override
    public ArrayList<IWeapon> GetAvailableWeapons() {
        return AvailableWeapons.GetAvailableWeapons().stream()
                .filter(s -> s.getHero() instanceof Gunner)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
