package main.java;

public class Rover {

    private int xCoordinate;
    private int yCoordinate;
    private Direction direction;

    public Rover() {
        this(0, 0, Direction.N);
    }

    public Rover(int xCoordinate, int yCoordinate, Direction direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
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
        this.xCoordinate += direction.getxComponent();
        this.yCoordinate += direction.getyComponent();
    }

    // Moves backward by subtracting the directional components from rover's
    // position
    public void moveBackward() {
        this.xCoordinate -= direction.getxComponent();
        this.yCoordinate -= direction.getyComponent();

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
