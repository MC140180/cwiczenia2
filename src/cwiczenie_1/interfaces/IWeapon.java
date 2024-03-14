package cwiczenie_1.interfaces;

import cwiczenie_1.enums.VocationEnum;
import cwiczenie_1.models.characters.Hero;

public interface IWeapon {
    void attack();
    VocationEnum getAvailableVocationToUse();
}
