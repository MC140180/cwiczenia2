package cwiczenie_2;

public class SendVoiceMessage implements ISendAd {
    @Override
    public void sendAd(Advertisement advertisement, AdTarget adTarget) {
        adTarget.getPersonalData();
        System.out.println(advertisement.getTranslatedContent() + "wyslano voice message do" + adTarget.getPersonalData().getVoiceChatId());
    }
}
