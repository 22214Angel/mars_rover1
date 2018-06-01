import java.util.Objects;

public class Rover {
    private int x;
    private RoverDirection direction;

    public Rover(int x, RoverDirection direction) {
        this.x = x;
        this.direction = direction;
    }

    private Changeable selectRover(PossibleActionsOnRover action, RoverDirection direction) {
        switch (action) {
            case LEFT:
            case RIGHT:
                return new RoverDirectionChanger(action, direction);
        }
        return null;
    }

    public Rover changeRover(PossibleActionsOnRover action) {
        Changeable directionChanger = selectRover(action, direction);
        return directionChanger.applyAction();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return direction == rover.direction;
    }

    @Override
    public int hashCode() {

        return Objects.hash(direction);
    }
}