package jp.co.rakuten.checkout.test;

import org.springframework.stereotype.Component;

import jp.co.rakuten.checkout.api.LogWriter;

@Component
public class ConsoleWriter implements LogWriter{

    public void write(String text) {
        // TODO Auto-generated method stub
        System.out.println("Console Writer : "+text);
    }

}
