package jp.co.rakuten.checkout.test;

public class Person {
    
    private int id;
    private String name ;
    private Address add;
    private int taxId;
    
    public Person(){
        
    }
    
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
 public void speak(){
     System.out.println("hello");
 }

public void setAdd(Address add) {
    this.add = add;
}


public void setTaxId(int taxId) {
    this.taxId = taxId;
}

@Override
public String toString() {
    return "Person [id=" + id + ", name=" + name + ", add=" + add + ", taxId=" + taxId + "]";
}

public void onCreate(){
    System.out.println("Person Created");
}

public void onDestroy(){
    System.out.println("Person Destroyed");
}

public static Person getInstance(int id,String name){
    return new Person(id, name);
}
}
