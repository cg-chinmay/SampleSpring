package jp.co.rakuten.checkout.test;



import java.util.ArrayList;
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
     Offer offer1 = new Offer(16,"lucy","667M@rakuten.com","captain");
     Offer offer2 = new Offer(14,"Paul","alexdf@yahoo.com","web designer");
     List<Offer> offerList = new ArrayList<Offer>();
     offerList.add(offer1);
     offerList.add(offer2);
     int[] values = offersDao.create(offerList);
     for(int val:values){
    	 System.out.println("Updated "+val+" rows");
     }
     List<Offer> offers = offersDao.getOffers();
     for(Offer offer:offers){
         System.out.println(offer);
     }
  
     ((ClassPathXmlApplicationContext)context).close();
    }

}
