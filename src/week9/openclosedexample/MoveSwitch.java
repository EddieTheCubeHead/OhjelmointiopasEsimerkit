package week9.openclosedexample;

// Huomioi ilmansuuntien uudelleenkäyttö viikolta 3. Koska luokka on eri paketissa, täytyy luokka
// tuoda nimiavaruuteen import-komennolla
import week3.enumexample.CompassPoint;

public class MoveSwitch {

    public void movePlayer(Player player, CompassPoint direction) {
        switch (direction) {
            case NORTH:
                player.setX(player.getX() + 1);
                break;
            case EAST:
                player.setY(player.getY() + 1);
                break;
            case SOUTH:
                player.setX(player.getX() - 1);
                break;
            case WEST:
                player.setY(player.getY() - 1);
                break;
        }
    }
}
