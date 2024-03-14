package cwiczenie_2.senders;

import cwiczenie_2.models.AdTarget;
import cwiczenie_2.models.Advertisement;
import cwiczenie_2.interfaces.ISendAd;

public class SendByEmail implements ISendAd {

    @Override
    public boolean checkIfPaymentIsCorrect(int payment) {
        return payment >= 10;
    }

    @Override
    public void sendAd(Advertisement advertisement, AdTarget adTarget) {

        advertisement.setTranslatedContent(adTarget.translateMessage(advertisement.getContent()));

        System.out.println(advertisement.getTranslatedContent() + "wyslano email do " + adTarget.getPersonalData().getEmail());
    }
}
