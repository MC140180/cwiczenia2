package cwiczenie_2;

public class DeutschTranslator implements ITranslationInterface {


    @Override
    public String translate(String content) {
        return "przetlumaczony na niemiecki" + content;
    }
}
