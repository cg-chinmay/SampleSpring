package jp.co.rakuten.checkout.test;

public class Logger {
    private FileWriter fileWriter;
    private ConsoleWriter consoleWriter;
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }
    public void fileWrite(String text){
        fileWriter.write(text);
    }
    public void consoleWrite(String text){
        consoleWriter.write(text);
    }
}
