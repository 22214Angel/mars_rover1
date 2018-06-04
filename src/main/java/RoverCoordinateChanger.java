public class RoverCoordinateChanger implements  Changeable {
    private int x;
    private RoverDirection direction;

    public RoverCoordinateChanger(int x, RoverDirection direction) {
        this.x = x;
        this.direction = direction;
    }

    @Override
    public Rover applyAction() {
        return new Rover(x+1, direction);
    }
}
