package ch4.xml;

import ch4.MessageProvider;

public class ConfigurableMessageProvider implements MessageProvider {

    private String message;

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
}
