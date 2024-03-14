package cwiczenie_2.senders;

import cwiczenie_2.models.AdTarget;
import cwiczenie_2.models.Advertisement;
import cwiczenie_2.interfaces.ISendAd;

public class SendBySMS implements ISendAd {
    @Override
    public boolean checkIfPaymentIsCorrect(int payment) {
        return payment >= 50;
    }
    @Override
    public void sendAd(Advertisement advertisement, AdTarget adTarget) {
        advertisement.setTranslatedContent(adTarget.translateMessage(advertisement.getContent()));

        System.out.println(advertisement.getTranslatedContent() + "wyslano sms do" + adTarget.getPersonalData().getPhoneNumber());
    }
}
