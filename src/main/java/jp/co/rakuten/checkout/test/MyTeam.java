package jp.co.rakuten.checkout.test;

import java.util.List;

public class MyTeam {
private Players captain;
private List<Players> players;
public Players getCaptain() {
    return captain;
}
public void setCaptain(Players captain) {
    this.captain = captain;
}
public List<Players> getPlayers() {
    return players;
}
public void setPlayers(List<Players> players) {
    this.players = players;
}
@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("My Team contains ");
    for(Players player:players){
        sb.append("\n"+player.getName());
    }
    sb.append("\nThe Captain is "+captain.getName());
    return sb.toString();
}

}
