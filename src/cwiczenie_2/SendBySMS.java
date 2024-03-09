package cwiczenie_2;

public class SendBySMS implements ISendAd {
    @Override
    public void sendAd(Advertisement advertisement, AdTarget adTarget) {
        adTarget.getPersonalData();
        System.out.println(advertisement.getTranslatedContent() + "wyslano sms do" + adTarget.getPersonalData().getPhoneNumber());
    }
}
