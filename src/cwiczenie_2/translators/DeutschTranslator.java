package cwiczenie_2.translators;

import cwiczenie_2.interfaces.ITranslationInterface;

public class DeutschTranslator implements ITranslationInterface {
    @Override
    public String translate(String content) {
        return "przetlumaczony na niemiecki" + content;
    }
}
