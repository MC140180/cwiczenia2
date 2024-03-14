package cwiczenie_2;

import cwiczenie_2.models.AdTarget;
import cwiczenie_2.models.Advertisement;
import cwiczenie_2.models.Client;
import cwiczenie_2.senders.SendByEmail;
import cwiczenie_2.senders.SendBySMS;
import cwiczenie_2.senders.SendVoiceMessage;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
       Advertisement advertisement = Database.GetRandomAd();
        ArrayList<AdTarget> adTargets = Database.getRandomTargets(); //for better test
        AdTarget adTarget = Database.getRandomTarget();

        Client client1 = new Client("Firma1");
        Client client2 = new Client("Firma2");
        Client client3 = new Client("Firma3");

        client1.pay(500);

        ArrayList<Client> clients = new ArrayList<Client>();
        client1.pay(100);
        client2.pay(200);
        client3.pay(5);
        client1.setSendAd(new SendByEmail());
        client2.setSendAd(new SendBySMS());
        client3.setSendAd(new SendVoiceMessage());
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.forEach(client -> {
            adTargets.forEach(target -> {
                client.doSendAd(advertisement, target);
            });
        });


        client3.pay(5);
        client3.setSendAd(new SendByEmail());
        System.out.println(client3.getBalance());
        client3.doSendAd(advertisement, adTarget);

    }
}
