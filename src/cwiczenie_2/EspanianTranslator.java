package cwiczenie_2;

public class EspanianTranslator implements ITranslationInterface{
    @Override
    public String translate(String content) {
        return "przetlumaczony na hiszpanski" + content;

    }
}
