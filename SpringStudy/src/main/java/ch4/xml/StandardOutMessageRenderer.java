package ch4.xml;

import ch4.MessageProvider;
import ch4.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;

public class StandardOutMessageRenderer implements MessageRenderer {

    @Autowired
    private MessageProvider messageProvider;

    @Override
    public void render() {
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
}
