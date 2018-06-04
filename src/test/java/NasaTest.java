import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class NasaTest {

    @Test
    public void shouldReturnTrueGivenCurrentDirectionEastAndActionLeft() {
        Rover rover = new Rover(1, 0, RoverDirection.EAST);
        Rover result = new Rover(1, 0, RoverDirection.NORTH);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionNorthAndActionLeft() {
        Rover rover = new Rover(1, 0, RoverDirection.NORTH);
        Rover result = new Rover(1, 0, RoverDirection.WEST);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionWestAndActionLeft() {
        Rover rover = new Rover(1, 0, RoverDirection.WEST);
        Rover result = new Rover(1, 0, RoverDirection.SOUTH);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionSouthAndActionLeft() {
        Rover rover = new Rover(1, 0, RoverDirection.SOUTH);
        Rover result = new Rover(1, 0, RoverDirection.EAST);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionNorthAndActionRight() {
        Rover rover = new Rover(2, 2, RoverDirection.NORTH);
        Rover result = new Rover(2, 2, RoverDirection.WEST);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionEastAndActionRight() {
        Rover rover = new Rover(1, 0, RoverDirection.SOUTH);
        Rover result = new Rover(1, 0, RoverDirection.EAST);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionWestAndActionRight() {
        Rover rover = new Rover(1, 2, RoverDirection.WEST);
        Rover result = new Rover(1, 2, RoverDirection.SOUTH);
        PossibleActionsOnRover action = PossibleActionsOnRover.LEFT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenCurrentDirectionSouthAndActionRight() {
        Rover rover = new Rover(2, 1, RoverDirection.SOUTH);
        Rover result = new Rover(2, 1, RoverDirection.WEST);
        PossibleActionsOnRover action = PossibleActionsOnRover.RIGHT;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenXAsOneWithDirectionEastAndActionMove() {
        Rover rover = new Rover(1, 0, RoverDirection.EAST);
        Rover result = new Rover(2, 0, RoverDirection.EAST);
        PossibleActionsOnRover action = PossibleActionsOnRover.MOVE;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenXAsOneWithDirectionNorthAndActionMove() {
        Rover rover = new Rover(1, 0, RoverDirection.WEST);
        Rover result = new Rover(0, 0, RoverDirection.WEST);
        PossibleActionsOnRover action = PossibleActionsOnRover.MOVE;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnFalseGivenXAsThreeAndActionMoveWithoutDirectionChange() {
        Rover rover = new Rover(3, 0, RoverDirection.EAST);
        Rover result = new Rover(4, 0, RoverDirection.WEST);
        PossibleActionsOnRover action = PossibleActionsOnRover.MOVE;

        assertEquals(false, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenYAsOneWithDirectionNorthAndActionMove() {
        Rover rover = new Rover(0, 1, RoverDirection.NORTH);
        Rover result = new Rover(0, 2, RoverDirection.NORTH);
        PossibleActionsOnRover action = PossibleActionsOnRover.MOVE;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenYAsOneWithDirectionSouthAndActionMove() {
        Rover rover = new Rover(0, 1, RoverDirection.SOUTH);
        Rover result = new Rover(0, 0, RoverDirection.SOUTH);
        PossibleActionsOnRover action = PossibleActionsOnRover.MOVE;

        assertEquals(true, result.equals(rover.changeRover(action)));
    }

    @Test
    public void shouldReturnTrueGivenXandYAsTwoWithDirectionSouthAndActionMoveFollowedByLeft() {
        Rover rover = new Rover(2, 2, RoverDirection.SOUTH);
        Rover result = new Rover(2, 1, RoverDirection.EAST);
        PossibleActionsOnRover action1 = PossibleActionsOnRover.MOVE;
        PossibleActionsOnRover action2 = PossibleActionsOnRover.LEFT;
        Rover roverAfterMoves = rover.changeRover(action1).changeRover(action2);

        assertEquals(true, result.equals(roverAfterMoves));
    }
}

