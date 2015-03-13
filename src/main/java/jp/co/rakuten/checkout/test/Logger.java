package jp.co.rakuten.checkout.test;

import jp.co.rakuten.checkout.api.LogWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {
   
    @Autowired
    @Qualifier("toFile")
    private LogWriter fileWriter;
    
    @Autowired
    @Qualifier("toConsole")
    private ConsoleWriter consoleWriter;
    
   
    public void fileWrite(String text){
        fileWriter.write(text);
    }
    public void consoleWrite(String text){
        consoleWriter.write(text);
    }
}
