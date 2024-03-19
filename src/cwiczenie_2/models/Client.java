package cwiczenie_2.models;

import cwiczenie_2.interfaces.ISendAd;

public class Client {
    private String name;
    private ISendAd sender;

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

    public ISendAd getSender() {
        return sender;
    }

    public void setSendAd(ISendAd sendAd) {
        if (!sendAd.checkIfPaymentIsCorrect(this.getBalance())) {
            System.out.println("pay first");
            return;
        }
        this.sender = sendAd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void performSendAd(Advertisement advertisement, AdTarget adTarget) {
        if (this.sender == null) {
            System.out.println("Select advertising method first");
            return;
        }
        advertisement.setTranslatedContent(adTarget.translateMessage(advertisement.getContent()));
        this.sender.sendAd(advertisement, adTarget);
    }

    public void pay(int payment) {
        this.addToBalance(payment);
    }
}
