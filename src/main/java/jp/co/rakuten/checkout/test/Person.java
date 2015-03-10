package jp.co.rakuten.checkout.test;

public class Person {
    
    private int id;
    private String name ;
    private Address add;
    
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

@Override
public String toString() {
    return "Person [id=" + id + ", name=" + name + ", add=" + add + "]";
}

 
}
