package test.java;

import main.java.Direction;
import main.java.Rover;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverTest {

    private Rover rover;

    @Before
    public void iniitialSetup() {
        rover = new Rover();
    }


    // Helper method created to assert rover's current position and direction
    private void assertPosition(Rover rover, int newX, int newY, Direction newDir) {
        Assert.assertEquals(newX, rover.getxCoordinate());
        Assert.assertEquals(newY, rover.getyCoordinate());
        Assert.assertEquals(newDir, rover.getDirection());

    }

    @Test
    public void roverCanMoveOneStepForward() {
        assertPosition(rover, 0, 0, Direction.N);
        rover.moveForward();
        assertPosition(rover, 0, 1, Direction.N);
    }

    @Test
    public void roverCanMoveMultipleStepsForward() {
        assertPosition(rover, 0, 0, Direction.N);
        rover.moveForward();
        rover.moveForward();
        rover.moveForward();
        rover.moveForward();
        rover.moveForward();
        assertPosition(rover, 0, 5, Direction.N);
    }

    @Test
    public void roverCanMoveOneStepBackward() {
        assertPosition(rover, 0, 0, Direction.N);
        rover.moveBackward();
        assertPosition(rover, 0, -1, Direction.N);
    }

    @Test
    public void roverCanMoveMultipleStepsBackward() {
        assertPosition(rover, 0, 0, Direction.N);
        rover.moveBackward();
        rover.moveBackward();
        rover.moveBackward();
        assertPosition(rover, 0, -3, Direction.N);
    }
}
