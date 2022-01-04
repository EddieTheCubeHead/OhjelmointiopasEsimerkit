package week9.openclosedexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MoveStrategyTest {

    @Test
    void movePlayerWhenCalledThenMovementCommandMovePlayerCalled() {
        MovementCommand mockCommand = mock(MovementCommand.class);
        Player player = new Player(0, 0);
        MoveStrategy mover = new MoveStrategy();
        mover.movePlayer(player, mockCommand);
        verify(mockCommand, times(1)).movePlayer(player);
    }

}