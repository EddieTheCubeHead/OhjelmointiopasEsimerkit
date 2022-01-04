package week9.openclosedexample;

public class MoveEast implements MovementCommand {
    @Override
    public void movePlayer(Player player) {
        player.setY(player.getY() + 1);
    }
}
