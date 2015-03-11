package jp.co.rakuten.checkout.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
     ApplicationContext context = new ClassPathXmlApplicationContext("jp/co/rakuten/checkout/beans/ProjectBeans.xml");
     Logger log = (Logger)context.getBean("logger");
     log.fileWrite("Writing to File");
     log.consoleWrite("Write to Console");
     ((ClassPathXmlApplicationContext)context).close();
    }

}
