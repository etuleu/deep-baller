// 2 teams A vs B
// 11 players on each team A1, A2... B1, B2
// grid W x H (0, 0) to (100, 50)
// ball O
// T time steps
// each step any player can move one square adjacent
// the ball belongs to the player in the same square
// a player can pass the ball or shoot
// passing: probability of successful pass inv proportional to distance
// and player intercepting the path
// ball moves 2x faster than players

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

public class Game {

    public static final int NUM_PLAYERS= 11;
    public static final int GAME_TIME = 10;

    Team teamA;
    Team teamB;

    public Game() {
	teamA = new Team("A", initPlayers("A"));
	teamB = new Team("B", initPlayers("B"));
    }

    public void play() {
	for (int t = 0; t < GAME_TIME; t++) {
	    out.println("time " + t);
	    Team newTeamA = teamA.move(this);
	    Team newTeamB = teamB.move(this);
	    teamA = newTeamA;
	    teamB = newTeamB;
	}

	out.println("game over");
    }

    List<Player> initPlayers(String name) {
        List<Player> players = new ArrayList<Player>();
	for (int i = 0; i < NUM_PLAYERS; i++) {
	    // TODO: put the initial position of the players maybe
            players.add(new Player(name + i, 0, 0));
	}
	return players;
    }
}
