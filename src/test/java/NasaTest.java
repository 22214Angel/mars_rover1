import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class NasaTest {

    @Test
    public void shouldReturnTrueGivenCurrentDirectionEastAndActionLeft() {
        Rover rover = new Rover(1, RoverDirection.EAST);
        Rover result = new Rover(1, RoverDirection.NORTH);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionNorthAndActionLeft() {
        Rover rover = new Rover(1, RoverDirection.NORTH);
        Rover result = new Rover(1, RoverDirection.WEST);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionWestAndActionLeft() {
        Rover rover = new Rover(1, RoverDirection.WEST);
        Rover result = new Rover(1, RoverDirection.SOUTH);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionSouthAndActionLeft() {
        Rover rover = new Rover(1, RoverDirection.SOUTH);
        Rover result = new Rover(1, RoverDirection.EAST);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionNorthAndActionRight() {
        Rover rover = new Rover(2, RoverDirection.NORTH);
        Rover result = new Rover(2, RoverDirection.WEST);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionEastAndActionRight() {
        Rover rover = new Rover(1, RoverDirection.SOUTH);
        Rover result = new Rover(1, RoverDirection.EAST);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionWestAndActionRight() {
        Rover rover = new Rover(1, RoverDirection.WEST);
        Rover result = new Rover(1, RoverDirection.SOUTH);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionSouthAndActionRight() {
        Rover rover = new Rover(2, RoverDirection.SOUTH);
        Rover result = new Rover(2, RoverDirection.WEST);
        PossibleActionsOnRover action = PossibleActionsOnRover.RIGHT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenXAsOneAndActionMove() {
        Rover rover = new Rover(1, RoverDirection.SOUTH);
        Rover result = new Rover(2, RoverDirection.SOUTH);
        PossibleActionsOnRover action = PossibleActionsOnRover.MOVE;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }
}

