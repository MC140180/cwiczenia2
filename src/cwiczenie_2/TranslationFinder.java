package cwiczenie_2;

public class TranslationFinder {
    static ITranslationInterface GetUserTranslationInterface(String location){
        if(location == "DE"){ return new DeutschTranslator();}
        else if(location == "CZ"){ return new DeutschTranslator();}
        else if(location == "ES"){ return new EspanianTranslator();}
        return new EnglishTranslator();
    }
}
