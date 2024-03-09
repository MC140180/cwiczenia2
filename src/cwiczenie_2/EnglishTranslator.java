package cwiczenie_2;

public class EnglishTranslator implements ITranslationInterface {
    @Override
    public String translate(String content) {
        return "przetlumaczony" + content;
    }
}
