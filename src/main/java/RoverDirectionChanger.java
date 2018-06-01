public class RoverDirectionChanger implements Changeable{

    private char actionToBeDone;
    private char currentDirection;

    public RoverDirectionChanger(char actionToBeDone, char currentDirection) {
        this.actionToBeDone = actionToBeDone;
        this.currentDirection = currentDirection;
    }

    @Override
    public Rover applyAction() {
        char newDirection = '\0';
        switch (actionToBeDone) {
            case 'L':
                switch (currentDirection) {
                    case 'E':
                        newDirection = 'N';
                        break;
                    case 'W':
                        newDirection = 'S';
                        break;
                    case 'N':
                        newDirection = 'W';
                        break;
                    case 'S':
                        newDirection = 'E';
                        break;
                }
        }
        return new Rover(newDirection);
    }
}
