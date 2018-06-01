import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NasaTest {

    @Test
    public void shouldReturnTrueGivenCurrentDirectionEastAndActionLeft() {
        Rover rover = new Rover(RoverDirection.EAST);
        Rover result = new Rover(RoverDirection.NORTH);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionNorthAndActionLeft() {
        Rover rover = new Rover(RoverDirection.NORTH);
        Rover result = new Rover(RoverDirection.WEST);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionWestAndActionLeft() {
        Rover rover = new Rover(RoverDirection.WEST);
        Rover result = new Rover(RoverDirection.SOUTH);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionSouthAndActionLeft() {
        Rover rover = new Rover(RoverDirection.SOUTH);
        Rover result = new Rover(RoverDirection.EAST);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionNorthAndActionRight() {
        Rover rover = new Rover(RoverDirection.NORTH);
        Rover result = new Rover(RoverDirection.WEST);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionEastAndActionRight() {
        Rover rover = new Rover(RoverDirection.SOUTH);
        Rover result = new Rover(RoverDirection.EAST);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }


    @Test
    public void shouldReturnTrueGivenCurrentDirectionWestAndActionRight() {
        Rover rover = new Rover(RoverDirection.WEST);
        Rover result = new Rover(RoverDirection.SOUTH);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionSouthAndActionRight() {
        Rover rover = new Rover(RoverDirection.SOUTH);
        Rover result = new Rover(RoverDirection.WEST);
        PossibleActionsOnRover action = PossibleActionsOnRover.RIGHT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }
}
