package cwiczenie_2;

public class Database {
    static Advertisement GetRandomAd(){
        return new Advertisement("random content");
    }
    static AdTarget getRandomTarget(){
        // getting target from database
        // target got element in object with location, if not default message is english
        ITranslationInterface translationInterface = TranslationFinder.GetUserTranslationInterface("DE");
        return new AdTarget(translationInterface, new PersonalData("andrzej", "andrzej@wp.de", "999888222", "423523-daerg2-aa23-2321") );
    }
}
