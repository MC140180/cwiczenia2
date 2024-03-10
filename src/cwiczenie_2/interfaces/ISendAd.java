package cwiczenie_2.interfaces;

import cwiczenie_2.models.AdTarget;
import cwiczenie_2.models.Advertisement;

public interface ISendAd {
    void sendAd(Advertisement advertisement, AdTarget adTarget);
}
