package week9.openclosedexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week3.enumexample.CompassPoint;

import static org.junit.jupiter.api.Assertions.*;

class MoveSwitchTest {

    Player player;
    MoveSwitch mover;

    @BeforeEach
    void setUp() {
        this.player = new Player(0, 0);
        this.mover = new MoveSwitch();
    }

    @Test
    void movePlayerWhenCalledWithNorthThenPlayerXIncreasedByOne() {
        this.mover.movePlayer(player, CompassPoint.NORTH);
        assertEquals(1, player.getX());
    }

    @Test
    void movePlayerWhenCalledWithEastThenPlayerYIncreasedByOne() {
        this.mover.movePlayer(player, CompassPoint.EAST);
        assertEquals(1, player.getY());
    }

    @Test
    void movePlayerWhenCalledWithSouthThenPlayerXDecreasedByOne() {
        this.mover.movePlayer(player, CompassPoint.SOUTH);
        assertEquals(-1, player.getX());
    }

    @Test
    void movePlayerWhenCalledWithWestThenPlayerYDecreasedByOne() {
        this.mover.movePlayer(player, CompassPoint.WEST);
        assertEquals(-1, player.getY());
    }

}