package main.java;

public class Rover {

    private int xCoordinate;
    private int yCoordinate;
    private Direction direction;
    private Planet planet;

    public Rover() {
        this(0, 0, Direction.N);
    }

    public Rover(int xCoordinate, int yCoordinate, Direction direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
        this.planet = new Planet();
    }

    public Rover(int xCoordinate, int yCoordinate, Direction direction, Planet planet) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
        this.planet = planet;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public Direction getDirection() {
        return direction;
    }


    // Moves forward by adding the directional components to rover's position
    public void moveForward() {
        int newXCoordinate = xCoordinate + direction.getxComponent();
        int newYCoordinate = yCoordinate + direction.getyComponent();

        updatePosition(newXCoordinate, newYCoordinate);
    }


    // Moves backward by subtracting the directional components from rover's
    // position
    public void moveBackward() {
        int newXCoordinate = xCoordinate - direction.getxComponent();
        int newYCoordinate = yCoordinate - direction.getyComponent();

        updatePosition(newXCoordinate, newYCoordinate);
    }


    // Helper method which handles wrapping around the planet and obstacle
    // detection
    private void updatePosition(int newXCoordinate, int newYCoordinate) {
        newXCoordinate = wrapXCoordinate(newXCoordinate);
        newYCoordinate = wrapYCoordinate(newYCoordinate);

        if (planet.hasObstacle(newXCoordinate, newYCoordinate)) {
            System.out.println("Rover has encountered an obstacle at (" +
                                newXCoordinate + ", " + newYCoordinate + ").");
            return;
        }

        this.xCoordinate = newXCoordinate;
        this.yCoordinate = newYCoordinate;
    }


    // Helper method that wraps the given x coordinate according to the
    // width of the planet
    private int wrapXCoordinate(int newXCoordinate) {
        int planetWidth = planet.getWidth();
        newXCoordinate = (newXCoordinate + planetWidth) % planetWidth;
        return newXCoordinate;

    }


    // Helper method that wraps the given y coordinate according to the
    // length of the planet
    private int wrapYCoordinate(int newYCoordinate) {
        int planetLength = planet.getLength();
        newYCoordinate = (newYCoordinate + planetLength) % planetLength;
        return newYCoordinate;
    }


    // Rotate the rover 90 degrees clockwise
    public void rotateRight() {
        this.direction = direction.rotateRight();
    }


    // Rotate the rover 90 degrees anticlockwise
    public void rotateLeft() {
        this.direction = direction.rotateLeft();
    }

 }
