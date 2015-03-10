package jp.co.rakuten.checkout.test;

public class PersonFactory {
public Person createPersons(int id, String name){
    return new Person(id, name);
}
}
