package jp.co.rakuten.checkout.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
    private String id;
    private String text = "Hello";

    public void speak() {
        System.out.println(id + " : " + text);
    }
    
    //Speech = getSpeech() 
    // However everytime random method called inside getSpeech() so value returned is different 
    // ? checks that random.speech is not null only then apply length() method 
    @Autowired
    public void setId(@Value("#{randomText.speech?.length()}") String id) {
        this.id = id;
    }
    
    @Autowired
    public void setText(@Value("#{'Hello '+randomText.getSpeech()}") String text) {
        this.text = text;
    }

}
