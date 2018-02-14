package main.java;

public class Rover {

    private int xCoordinate;
    private int yCoordinate;
    private char direction;

    public Rover() {
        this(0, 0, 'N');
    }

    public Rover(int xCoordinate, int yCoordinate, char direction) {
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

    public char getDirection() {
        return direction;
    }

    public void moveForward() {
        switch(direction) {
            case 'N':
                xCoordinate += 0;
                yCoordinate += 1;
                break;
            case 'E':
                xCoordinate += 1;
                yCoordinate += 0;
                break;
            case 'W':
                xCoordinate += 1;
                yCoordinate += 0;
                break;
            case 'S':
                xCoordinate += 1;
                yCoordinate += 0;
                break;
        }

    }

    public void moveBackward() {
        switch(direction) {
            case 'N':
                xCoordinate -= 0;
                yCoordinate -= 1;
                break;
            case 'E':
                xCoordinate -= 1;
                yCoordinate -= 0;
                break;
            case 'W':
                xCoordinate += 1;
                yCoordinate += 0;
                break;
            case 'S':
                xCoordinate += 1;
                yCoordinate += 0;
                break;
        }

    }

}
