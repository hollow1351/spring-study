package ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class UsingSetterInjection {

    public static void main(String[] args) {
        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load("classpath:parent.xml");
        parent.refresh();
        
        GenericXmlApplicationContext c = new GenericXmlApplicationContext();
        c.load("classpath:app-context-xml.xml");
        c.setParent(parent);
        c.refresh();

        MessageRenderer r = c.getBean("messageRenderer", MessageRenderer.class);
        r.render();
    }
}
