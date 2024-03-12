package cwiczenie_1;

import cwiczenie_1.interfaces.IWeapon;
import cwiczenie_1.models.weapons.Sword;

import java.util.ArrayList;

public class AvailableWeapons {

    static public ArrayList<IWeapon> GetAvailableWeapons(){
        ArrayList<IWeapon> availableWeapons = new ArrayList<IWeapon>();
        availableWeapons.add(new Sword());
        return availableWeapons;
    }
}
