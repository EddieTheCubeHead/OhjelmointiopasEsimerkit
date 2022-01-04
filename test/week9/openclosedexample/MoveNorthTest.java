package week9.openclosedexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveNorthTest {

    @Test
    void movePlayerWhenCalledThenPlayerXIncreasedByOne() {
        Player player = new Player(0, 0);
        MovementCommand command = new MoveNorth();
        command.movePlayer(player);
        assertEquals(1, player.getX());
    }

}