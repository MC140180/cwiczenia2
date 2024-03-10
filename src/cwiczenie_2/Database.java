package cwiczenie_2;

import cwiczenie_2.models.AdTarget;
import cwiczenie_2.models.Advertisement;
import cwiczenie_2.models.PersonalData;
import cwiczenie_2.translators.EnglishTranslator;

import java.util.ArrayList;

public class Database {
    static Advertisement GetRandomAd() {
        return new Advertisement("random content");
    }

    static ArrayList<AdTarget> getRandomTargets() {
        // getting targets from database, getting three not just one just for better test, it is mock
        // target got element in object with location, otherwise default message is in english

        ArrayList<AdTarget> targets = new ArrayList<>();
        AdTarget adTarget = new AdTarget(new EnglishTranslator(), new PersonalData("andrzej", "andrzej@wp.de", "999888222", "423523-daerg2-aa23-2321", "DE"));
        AdTarget adTarget1 = new AdTarget(new EnglishTranslator(), new PersonalData("andrzej1", "andrzej1@wp.de", "9299888222", "423523-bbbbb-aa23-2321", "ES"));
        AdTarget adTarget2 = new AdTarget(new EnglishTranslator(), new PersonalData("andrzej2", "andrzej2@wp.de", "9399888222", "423523-aaaaa-aa23-2321", "EN"));

        targets.add(adTarget);
        targets.add(adTarget1);
        targets.add(adTarget2);

        for (AdTarget target : targets) {
            String nationality = target.getPersonalData().getNationality();
            if (!(nationality == "EN"))
                target.setTranslationInterface(TranslationFinder.GetUserTranslationInterface(nationality));
        }

        return targets;
    }

    static AdTarget getRandomTarget() {
        // getting targets from database, getting three not just one just for better test, it is mock
        // target got element in object with location, otherwise default message is in english

        AdTarget adTarget = new AdTarget(new EnglishTranslator(), new PersonalData("andrzej", "andrzej@wp.de", "999888222", "423523-daerg2-aa23-2321", "DE"));


        String nationality = adTarget.getPersonalData().getNationality();
        if (!(nationality == "EN"))
            adTarget.setTranslationInterface(TranslationFinder.GetUserTranslationInterface(nationality));

        return adTarget;
    }
}
