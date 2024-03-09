package cwiczenie_2;

public class AdTarget {
    private ITranslationInterface translationInterface;
    private PersonalData personalData;

    public AdTarget(ITranslationInterface translationInterface, PersonalData personalData) {
        this.translationInterface = translationInterface;
        this.personalData = personalData;
    }


    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public ITranslationInterface getTranslationInterface() {
        return translationInterface;
    }

    public void setTranslationInterface(ITranslationInterface translationInterface) {
        this.translationInterface = translationInterface;
    }
    public String translateMessage(String content){
        return this.translationInterface.translate(content);
    }
}
