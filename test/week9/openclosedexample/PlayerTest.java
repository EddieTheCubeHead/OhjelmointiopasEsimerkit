package week9.openclosedexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getXWhenCalledThenPlayerXCoordinateReturned() {
        Player player = new Player(2, 0);
        assertEquals(2, player.getX());
    }

    @Test
    void getYWhenCalledThenPlayerYCoordinateReturned() {
        Player player = new Player(0, 2);
        assertEquals(2, player.getY());
    }

    @Test
    void setXWhenCalledThenPlayerXCoordinateSet() {
        Player player = new Player(0, 0);
        player.setX(2);
        assertEquals(2, player.getX());
    }

    @Test
    void setYWhenCalledThenPlayerYCoordinateSet() {
        Player player = new Player(0, 0);
        player.setY(2);
        assertEquals(2, player.getY());
    }
}