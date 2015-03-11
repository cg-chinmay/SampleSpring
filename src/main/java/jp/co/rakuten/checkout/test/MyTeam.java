package jp.co.rakuten.checkout.test;

import java.util.Map;


public class MyTeam {
private Players captain;
private Map<String, String> players;

public Players getCaptain() {
    return captain;
}
public void setCaptain(Players captain) {
    this.captain = captain;
}


public Map<String, String> getPlayers() {
    return players;
}
public void setPlayers(Map<String, String> players) {
    this.players = players;
}

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("My Team contains ");
    for(Map.Entry<String, String> entry:players.entrySet()){
        sb.append("\n"+entry.getValue());
    }
    sb.append("\nThe Captain is "+captain.getName());
    return sb.toString();
}

}
