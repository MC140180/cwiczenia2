package cwiczenie_2;

public class SendBySMS implements ISendAd {
    @Override
    public void sendAd(Advertisement advertisement, AdTarget adTarget) {
        advertisement.setTranslatedContent(advertisement.getContent());

        System.out.println(advertisement.getTranslatedContent() + "wyslano sms do" + adTarget.getPersonalData().getPhoneNumber());
    }
}
