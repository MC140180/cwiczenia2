package cwiczenie_2;

public class SendByEmail implements ISendAd{


    @Override
    public void sendAd(Advertisement advertisement, AdTarget adTarget) {
        advertisement.setTranslatedContent(advertisement.getContent());

        System.out.println(advertisement.getTranslatedContent() + "wyslano email do " + adTarget.getPersonalData().getEmail());
    }
}
