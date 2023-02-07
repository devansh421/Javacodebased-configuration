package com.Divyanshu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c=new AnnotationConfigApplicationContext(MyConfig.class);
        
        AA obj=(AA)c.getBean("b1");
        obj.show();
    }
}
