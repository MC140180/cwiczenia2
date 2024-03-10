package cwiczenie_2.translators;

import cwiczenie_2.interfaces.ITranslationInterface;

public class EnglishTranslator implements ITranslationInterface {
    @Override
    public String translate(String content) {
        return "przetlumaczony na angielski" + content;
    }
}
