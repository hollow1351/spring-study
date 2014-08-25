package ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarhicalAppContextUsage {

    public static void main(String[] args) {
        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load("classpath:parent.xml");
        parent.refresh();
        
        GenericXmlApplicationContext c = new GenericXmlApplicationContext();
        c.load("classpath:app-context-xml.xml");
        c.setParent(parent);
        c.refresh();
        
        System.out.println(c.getBean("target1", SimpleTarget.class).getVal());
        System.out.println(c.getBean("target2", SimpleTarget.class).getVal());
        System.out.println(c.getBean("target3", SimpleTarget.class).getVal());
    }
}
