package week9.openclosedexample;

public class MoveSouth implements MovementCommand {
    @Override
    public void movePlayer(Player player) {
        player.setX(player.getX() - 1);
    }
}
