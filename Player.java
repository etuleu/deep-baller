public class Player {

    final String name;
    final int x;
    final int y;

    public Player(String name, int x, int y) {
	this.name = name;
	this.x = x;
	this.y = y;
    }

    public Player move(Game game) {
	Player p = new Player(name, x, y);
	// TODO: randomize x, y
	return p;
    }
}
