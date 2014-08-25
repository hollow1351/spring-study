package ch4.annotation;

import ch4.MessageProvider;
import org.springframework.stereotype.Service;

//@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "HelloWorld";
    }
}
