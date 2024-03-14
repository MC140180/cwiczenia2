package cwiczenie_2.senders;

import cwiczenie_2.models.AdTarget;
import cwiczenie_2.models.Advertisement;
import cwiczenie_2.interfaces.ISendAd;

public class SendVoiceMessage implements ISendAd {
    @Override
    public boolean checkIfPaymentIsCorrect(int payment) {
        return payment >= 200;
    }
    @Override
    public void sendAd(Advertisement advertisement, AdTarget adTarget) {
        advertisement.setTranslatedContent(adTarget.translateMessage(advertisement.getContent()));

        System.out.println(advertisement.getTranslatedContent() + "wyslano voice message do" + adTarget.getPersonalData().getVoiceChatId());
    }
}
