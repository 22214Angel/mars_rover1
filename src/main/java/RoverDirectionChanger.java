public class RoverDirectionChanger implements Changeable{

    private PossibleActionsOnRover actionToBeDone;
    private RoverDirection currentDirection;

    public RoverDirectionChanger(PossibleActionsOnRover actionToBeDone, RoverDirection currentDirection) {
        this.actionToBeDone = actionToBeDone;
        this.currentDirection = currentDirection;
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
        }
        return new Rover(newDirection);
    }
}
