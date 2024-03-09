package cwiczenie_2;

public class TranslationFinder {
    static ITranslationInterface GetUserTranslationInterface(String location){
        if(location == "DE"){ new DeutschTranslator();}
        else if(location == "CZ"){ new DeutschTranslator();}
        else if(location == "ES"){new EspanianTranslator();}
        return new EnglishTranslator();
    }
}
