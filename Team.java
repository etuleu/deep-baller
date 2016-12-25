import java.util.List;
import java.util.ArrayList;

public class Team {

    final String name;
    final List<Player> players;

    public Team(String name, List<Player> players) {
	this.name = name;
	this.players = players;
    }

    public Team move(Game game) {
	List<Player> newPlayers = new ArrayList<Player>();
	for (Player p: players) {
	    Player newP = p.move(game);
	    newPlayers.add(newP);
	}
	return new Team(name, newPlayers);
    }
}
