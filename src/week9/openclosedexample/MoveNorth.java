package week9.openclosedexample;

public class MoveNorth implements MovementCommand {
    @Override
    public void movePlayer(Player player) {
        player.setX(player.getX() + 1);
    }
}
