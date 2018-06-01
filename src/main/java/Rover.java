import java.util.Objects;

public class Rover {
    private char direction;

    public Rover(char direction) {
        this.direction = direction;
    }

    private Changeable selectRover(char action, char direction) {
        switch (action) {
            case 'L':
            case 'R':
                return new RoverDirectionChanger(action, direction);
        }
        return null;
    }

    public Rover changeRover(char action) {
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