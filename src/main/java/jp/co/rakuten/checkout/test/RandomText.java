package jp.co.rakuten.checkout.test;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomText {
private String[] texts = {"Paul", "Mike", "Larry", null};

public String getSpeech(){
      Random random = new Random();
      return texts[random.nextInt(texts.length)];
}

}
