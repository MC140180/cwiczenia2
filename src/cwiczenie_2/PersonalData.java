package cwiczenie_2;

public class PersonalData {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final String voiceChatId;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getVoiceChatId() {
        return voiceChatId;
    }

    public PersonalData(String name, String email, String phoneNumber, String voiceChatId) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.voiceChatId = voiceChatId;
    }
}
