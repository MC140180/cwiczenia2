package cwiczenie_2;

import java.util.ArrayList;
import java.util.Objects;

public class Database {
    static Advertisement GetRandomAd(){
        return new Advertisement("random content");
    }
    static ArrayList<AdTarget>  getRandomTarget(){
        // getting target from database
        // target got element in object with location, if not default message is english
        ArrayList<AdTarget> targets = new ArrayList<>();
        AdTarget adTarget =  new AdTarget(new EnglishTranslator(), new PersonalData("andrzej", "andrzej@wp.de", "999888222", "423523-daerg2-aa23-2321", "DE") );
        AdTarget adTarget1 =  new AdTarget(new EnglishTranslator(), new PersonalData("andrzej", "andrzej@wp.de", "999888222", "423523-daerg2-aa23-2321", "ES") );
        AdTarget adTarget2 =  new AdTarget(new EnglishTranslator(), new PersonalData("andrzej", "andrzej@wp.de", "999888222", "423523-daerg2-aa23-2321", "EN") );

        targets.add(adTarget);
        targets.add(adTarget1);
        targets.add(adTarget2);

        for(AdTarget target:targets){
            String nationality = target.getPersonalData().getNationality();
            System.out.println(nationality == "EN");
            if(!(nationality == "EN")) target.setTranslationInterface(TranslationFinder.GetUserTranslationInterface(nationality));
        }

               return targets;
    }
}
