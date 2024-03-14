package cwiczenie_2.models;

import cwiczenie_2.interfaces.ISendAd;

public class Client {
    private String name;
    private ISendAd sendAd;

    private int balance;



    public Client(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }

    private void setBalance(int paymentValue) {
        this.balance = paymentValue;
    }
    private void addToBalance(int paymentValue) {
        this.balance += paymentValue;
    }
    public ISendAd getSendAd() {
        return sendAd;
    }

    public void setSendAd(ISendAd sendAd) {
       if(!sendAd.checkIfPaymentIsCorrect(this.getBalance())) {
          System.out.println("pay first");
           return;
       }
        this.sendAd = sendAd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void doSendAd(Advertisement advertisement, AdTarget adTarget) {
        if (this.sendAd == null) {
            System.out.println("Select advertising method first");
            return;
        }
        advertisement.setTranslatedContent(adTarget.translateMessage(advertisement.getContent()));
        this.sendAd.sendAd(advertisement, adTarget);
    }
    public void pay(int payment){
        this.addToBalance(payment);
    }
}
