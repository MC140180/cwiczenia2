package cwiczenie_2.models;

import cwiczenie_2.interfaces.ISendAd;

public class Advertisement {
    private final String content;
    private String translatedContent;

    public Advertisement(String content, ISendAd sendAd) {
        this.content = content;
    }

    public String getTranslatedContent() {
        return translatedContent;
    }

    public void setTranslatedContent(String translatedContent) {
        this.translatedContent = translatedContent;
    }

    public Advertisement(String content) {
        this.content = content;
    }


    public String getContent() {
        return content;
    }
}
