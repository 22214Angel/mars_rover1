import java.util.Objects;

public class Rover {

    private char direction;

    public Rover(char direction) {
        this.direction = direction;
    }

    public Rover applyAction(char action) {
        char newDirection = '\0';
        switch (action) {
        case 'L':
            if (direction == 'E') {
                newDirection = 'N';
            } else if (direction == 'W') {
                newDirection = 'S';
            }
        }
        return new Rover(newDirection);
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