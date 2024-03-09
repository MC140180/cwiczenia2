package cwiczenie_1;

import java.util.ArrayList;

public class AvailableWeapons {

    static ArrayList<IWeapon> GetAvailableWeapons(){
        ArrayList<IWeapon> availableWeapons = new ArrayList<IWeapon>();
        availableWeapons.add(new Sword());
        return availableWeapons;
    }
}
