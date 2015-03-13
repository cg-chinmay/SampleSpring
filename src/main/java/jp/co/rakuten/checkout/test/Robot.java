package jp.co.rakuten.checkout.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
private int id = 0;
private String text = "Hello";

public void speak(){
    System.out.println(id + " : "+text);
}
@Autowired
public void setId(@Value("1") int id) {
    this.id = id;
}
@Autowired
public void setText(@Value("Hello World") String text) {
    this.text = text;
}

}
