package cwiczenie_1.models.weapons;

import cwiczenie_1.enums.VocationEnum;

public class Bow extends Weapon{

    public Bow(){
        super(VocationEnum.ARCHER);
    }
    @Override
    public void attack() {
        System.out.println("Shooting from bow");
    }
}
