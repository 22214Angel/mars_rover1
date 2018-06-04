public class RoverCoordinateChanger implements  Changeable {
    private int x;
    private int y;
    private RoverDirection direction;

    public RoverCoordinateChanger(int x, int y, RoverDirection direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public Rover applyAction() {
        int newX = x;
        int newY = y;
        switch (direction) {
            case EAST:
                newX = x + 1;
                break;
            case WEST:
                newX = x - 1;
                break;
            case NORTH:
                newY = y + 1;
                break;
            case SOUTH:
                newY = y - 1;
                break;
        }
        return new Rover(newX, newY, direction);
    }
}
