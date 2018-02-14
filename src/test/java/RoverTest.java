package test.java;

import main.java.Direction;
import main.java.Rover;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverTest {

    private Rover rover;

    @Before
    public void initialSetup() {
        rover = new Rover();
    }


    // Helper method created to assert rover's current position and direction
    private void assertPosDir(Rover rover, int newX, int newY, Direction newDir) {
        Assert.assertEquals(newX, rover.getxCoordinate());
        Assert.assertEquals(newY, rover.getyCoordinate());
        Assert.assertEquals(newDir, rover.getDirection());

    }

    @Test
    public void roverCanMoveOneStepForward() {
        assertPosDir(rover, 0, 0, Direction.N);
        rover.moveForward();
        assertPosDir(rover, 0, 1, Direction.N);
    }


    @Test
    public void roverCanMoveOneStepBackward() {
        assertPosDir(rover, 0, 0, Direction.N);
        rover.moveBackward();
        assertPosDir(rover, 0, -1, Direction.N);
    }

    @Test
    public void roverCanMoveArbitraryNumberOfSteps() {
        assertPosDir(rover, 0, 0, Direction.N);
        rover.moveBackward();
        rover.moveForward();
        rover.moveForward();
        rover.moveForward();
        rover.moveBackward();
        rover.moveForward();
        rover.moveBackward();
        assertPosDir(rover, 0, 1, Direction.N);
    }

    @Test
    public void roverCanRotateRightOnce(){
        assertPosDir(rover, 0, 0, Direction.N);
        rover.rotateRight();
        assertPosDir(rover, 0, 0, Direction.E);
    }

    @Test
    public void roverCanRotateLeftOnce(){
        assertPosDir(rover, 0, 0, Direction.N);
        rover.rotateLeft();
        assertPosDir(rover, 0, 0, Direction.W);
    }

    @Test
    public void roverCanRotateArbitraryNumberOfTimes() {
        assertPosDir(rover, 0, 0, Direction.N);
        rover.rotateLeft();
        rover.rotateRight();
        rover.rotateRight();
        rover.rotateLeft();
        rover.rotateRight();
        assertPosDir(rover, 0, 0, Direction.E);
    }

    @Test
    public void roverCanMoveAndRotate() {
        assertPosDir(rover, 0, 0, Direction.N);
        rover.rotateLeft();
        rover.moveBackward();
        rover.rotateRight();
        rover.rotateRight();
        rover.moveBackward();
        rover.rotateLeft();
        rover.moveForward();
        rover.rotateRight();
        rover.moveForward();
        assertPosDir(rover, 1, 1, Direction.E);
    }
}
