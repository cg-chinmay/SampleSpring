package jp.co.rakuten.checkout.test;

import org.springframework.beans.factory.annotation.Qualifier;

import jp.co.rakuten.checkout.api.LogWriter;

@Qualifier("toFile")
public class FileWriter implements LogWriter{

    public void write(String text) {
        // TODO Auto-generated method stub
        System.out.println("File Writer : "+text);
    }
    

}
