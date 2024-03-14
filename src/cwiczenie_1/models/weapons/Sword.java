package cwiczenie_1.models.weapons;

import cwiczenie_1.enums.VocationEnum;
import cwiczenie_1.models.characters.Knight;

public class Sword extends Weapon {
    public Sword() {
        super(VocationEnum.KNIGHT);
    }

    @Override
    public void attack() {
        System.out.println("Sword attack");
    }
}
