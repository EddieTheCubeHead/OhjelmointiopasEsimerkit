package week9.openclosedexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveSouthTest {

    @Test
    void movePlayerWhenCalledThenPlayerXDecreasedByOne() {
        Player player = new Player(0, 0);
        MovementCommand command = new MoveSouth();
        command.movePlayer(player);
        assertEquals(-1, player.getX());
    }

}