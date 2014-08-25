package ch4.xml;

import ch4.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
