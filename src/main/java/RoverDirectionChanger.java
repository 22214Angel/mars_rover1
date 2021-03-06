public class RoverDirectionChanger implements Changeable{

    private PossibleActionsOnRover actionToBeDone;
    private RoverDirection currentDirection;
    private int x;
    private int y;

    public RoverDirectionChanger(PossibleActionsOnRover actionToBeDone, RoverDirection currentDirection, int x, int y) {
        this.actionToBeDone = actionToBeDone;
        this.currentDirection = currentDirection;
        this.x = x;
        this.y = y;
    }

    @Override
    public Rover applyAction() {
        RoverDirection newDirection = null;
        switch (actionToBeDone) {
            case LEFT:
                switch (currentDirection) {
                    case EAST:
                        newDirection = RoverDirection.NORTH;
                        break;
                    case WEST:
                        newDirection = RoverDirection.SOUTH;
                        break;
                    case NORTH:
                        newDirection = RoverDirection.WEST;
                        break;
                    case SOUTH:
                        newDirection = RoverDirection.EAST;
                        break;
                }
                break;
            case RIGHT:
                switch (currentDirection) {
                    case EAST:
                        newDirection = RoverDirection.SOUTH;
                        break;
                    case WEST:
                        newDirection = RoverDirection.NORTH;
                        break;
                    case NORTH:
                        newDirection = RoverDirection.EAST;
                        break;
                    case SOUTH:
                        newDirection = RoverDirection.WEST;
                        break;
                }
                break;
        }
        return new Rover(x, y, newDirection);
    }
}
