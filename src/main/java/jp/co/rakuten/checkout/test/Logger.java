package jp.co.rakuten.checkout.test;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

import jp.co.rakuten.checkout.api.LogWriter;


@Component
public class Logger {
   
    @Inject
    @Named(value="fileWriter")
    private LogWriter fileWriter;
    
    @Inject
    @Named(value="consoleWriter")
    private ConsoleWriter consoleWriter;
    
   
    public void fileWrite(String text){
        fileWriter.write(text);
    }
    public void consoleWrite(String text){
        consoleWriter.write(text);
    }
}
