package cwiczenie_2.models;

import cwiczenie_2.interfaces.ISendAd;

public class Client {
    private String name;
    private ISendAd sendAd;

    public Client(String name, ISendAd sendAd) {
        this.name = name;
        this.sendAd = sendAd;
    }

    public ISendAd getSendAd() {
        return sendAd;
    }

    public void setSendAd(ISendAd sendAd) {
        this.sendAd = sendAd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void doSendAd(Advertisement advertisement, AdTarget adTarget) {
        advertisement.setTranslatedContent(advertisement.getTranslatedContent());
        this.sendAd.sendAd(advertisement, adTarget);
    }
}
