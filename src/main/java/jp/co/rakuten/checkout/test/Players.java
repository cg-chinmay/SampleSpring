package jp.co.rakuten.checkout.test;

public class Players {
private String name;
private String country;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getCountry() {
    return country;
}
public void setCountry(String country) {
    this.country = country;
}
@Override
public String toString() {
    return "Players [name=" + name + ", country=" + country + "]";
}

}
