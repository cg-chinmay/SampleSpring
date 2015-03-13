package jp.co.rakuten.checkout.test;



public class Robot {
private String id;
private String text = "Hello";

public void speak(){
    System.out.println(id + " : "+text);
}

public void setId(String id) {
    this.id = id;
}

public void setText(String text) {
    this.text = text;
}


}
