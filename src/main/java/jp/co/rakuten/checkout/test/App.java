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
     Person person1 = (Person)context.getBean("person");
     System.out.println(person1);
     Person person2 = (Person)context.getBean("person2");
     System.out.println(person2);
     ((ClassPathXmlApplicationContext)context).close();
    }

}
