package test.java;

import main.java.Rover;
import org.junit.Assert;
import org.junit.Test;

public class RoverTest {

    private Rover rover = new Rover();


    private void assertPosition(Rover rover, int newX, int newY, char newDir) {
        Assert.assertEquals(newX, rover.getxCoordinate());
        Assert.assertEquals(newY, rover.getyCoordinate());
        Assert.assertEquals(newDir, rover.getDirection());

    }

    @Test
    public void roverCanMoveOneStepForward() {
        assertPosition(rover, 0, 0, 'N');
        rover.moveForward();
        assertPosition(rover, 0, 1, 'N');
    }

    @Test
    public void roverCanMoveMultipleStepsForward() {
        assertPosition(rover, 0, 0, 'N');
        rover.moveForward();
        rover.moveForward();
        rover.moveForward();
        rover.moveForward();
        rover.moveForward();
        assertPosition(rover, 0, 5, 'N');
    }

    @Test
    public void roverCanMoveOneStepBackward() {
        assertPosition(rover, 0, 0, 'N');
        rover.moveBackward();
        assertPosition(rover, 0, -1, 'N');
    }

    @Test
    public void roverCanMoveMultipleStepsBackward() {
        assertPosition(rover, 0, 0, 'N');
        rover.moveBackward();
        rover.moveBackward();
        rover.moveBackward();
        assertPosition(rover, 0, -3, 'N');
    }
}
