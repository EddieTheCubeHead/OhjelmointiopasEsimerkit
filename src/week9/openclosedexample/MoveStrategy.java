package week9.openclosedexample;

public class MoveStrategy {

    public void movePlayer(Player player, MovementCommand command) {
        command.movePlayer(player);
    }
}
