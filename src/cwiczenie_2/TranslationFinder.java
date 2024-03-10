package cwiczenie_2;

import cwiczenie_2.interfaces.ITranslationInterface;
import cwiczenie_2.translators.DeutschTranslator;
import cwiczenie_2.translators.EnglishTranslator;
import cwiczenie_2.translators.EspanianTranslator;

public class TranslationFinder {
    static ITranslationInterface GetUserTranslationInterface(String location){
        if(location == "DE"){ return new DeutschTranslator();}
        else if(location == "CZ"){ return new DeutschTranslator();}
        else if(location == "ES"){ return new EspanianTranslator();}
        return new EnglishTranslator();
    }
}
