package jp.co.rakuten.checkout.test;

import jp.co.rakuten.checkout.api.LogWriter;

public class FileWriter implements LogWriter{

    public void write(String text) {
        // TODO Auto-generated method stub
        System.out.println("File Writer : "+text);
    }
    

}
