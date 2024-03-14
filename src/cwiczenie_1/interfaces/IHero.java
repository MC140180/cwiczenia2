package cwiczenie_1.interfaces;

import cwiczenie_1.enums.VocationEnum;

public interface IHero {
    VocationEnum getMyRoleAsEnum();

    void selectWeapon(IWeapon weapon);
    IWeapon getCurrentWeapon();
}
