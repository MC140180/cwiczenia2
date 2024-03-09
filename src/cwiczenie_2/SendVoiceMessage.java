package cwiczenie_2;

public class SendVoiceMessage implements ISendAd {
    @Override
    public void sendAd(Advertisement advertisement, AdTarget adTarget) {
        advertisement.setTranslatedContent(adTarget.translateMessage(advertisement.getContent()));

        System.out.println(advertisement.getTranslatedContent() + "wyslano voice message do" + adTarget.getPersonalData().getVoiceChatId());
    }
}
