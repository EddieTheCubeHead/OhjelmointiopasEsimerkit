package week9.openclosedexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveWestTest {

    @Test
    void movePlayerWhenCalledThenPlayerYDecreasedByOne() {
        Player player = new Player(0, 0);
        MovementCommand command = new MoveWest();
        command.movePlayer(player);
        assertEquals(-1, player.getY());
    }

}