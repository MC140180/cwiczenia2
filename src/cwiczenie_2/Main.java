package cwiczenie_2;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
       Advertisement advertisement = Database.GetRandomAd();
        ArrayList<AdTarget> adTargets = Database.getRandomTargets(); //for better test
        AdTarget adTarget = Database.getRandomTarget();

        Client client1 = new Client("Firma1", new SendByEmail());
        Client client2 = new Client("Firma2", new SendBySMS());
        Client client3 = new Client("Firma3", new SendVoiceMessage());


        ArrayList<Client> clients = new ArrayList<Client>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.forEach(client -> {
            adTargets.forEach(target -> {
                client.doSendAd(advertisement, target);
            });
        });

        client1.doSendAd(advertisement, adTarget);
    }
}
