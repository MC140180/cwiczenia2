package cwiczenie_1;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Knight knight = new Knight();
      ArrayList<IWeapon> availableWeapons =  knight.GetAvailableWeapons();;

       knight.selectWeapon(availableWeapons.get(0));
        System.out.println(knight.currentWeapon);

       Archer archer = new Archer();
       archer.selectWeapon(new Sword());
        System.out.println(archer.currentWeapon);
    }
}