package cwiczenie_2;

public class Main {
    public static void main(String[] args) {
       Advertisement advertisement = Database.GetRandomAd();
        AdTarget adTarget = Database.getRandomTarget();

        Client client1 = new Client("Firma1", new SendByEmail());
        Client client2 = new Client("Firma2", new SendBySMS());
        Client client3 = new Client("Firma3", new SendVoiceMessage());

        client1.doSendAd(advertisement, adTarget);
        client2.doSendAd(advertisement, adTarget);
        client3.doSendAd(advertisement, adTarget);
    }
}
