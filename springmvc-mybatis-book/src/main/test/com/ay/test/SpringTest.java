package com.ay.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SpringTest {

    @Test
    public void testspring(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest");
        springTest.sayHello();
    }

    private void sayHello() {
        System.out.println("hello ay");
    }
}
