package jp.co.rakuten.checkout.test;



import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
     ApplicationContext context = new ClassPathXmlApplicationContext("jp/co/rakuten/checkout/beans/ProjectBeans.xml");
     OffersDAO offersDao = (OffersDAO)context.getBean("offersDao");
     Offer Uoffer = new Offer(10,"shane", "shane56@bing.com", "Spinner");
     offersDao.update(Uoffer);
     List<Offer> offers = offersDao.getOffers();
     for(Offer offer:offers){
         System.out.println(offer);
     }
  
     ((ClassPathXmlApplicationContext)context).close();
    }

}
