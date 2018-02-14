package test.java;

import main.java.Direction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DirectionTest {

    private Direction currentDirection;

    @Before
    public void InitialSetup() {
        this.currentDirection = Direction.N;
    }

    @Test
    public void canRotateRightOnce() {
        Assert.assertEquals(Direction.N, currentDirection);
        currentDirection = currentDirection.rotateRight();
        Assert.assertEquals(Direction.E, currentDirection);
    }

    @Test
    public void canRotateLeftOnce() {
        Assert.assertEquals(Direction.N, currentDirection);
        currentDirection = currentDirection.rotateLeft();
        Assert.assertEquals(Direction.W, currentDirection);
    }

    @Test
    public void canRotateArbitraryNumberOfTimes() {
        Assert.assertEquals(Direction.N, currentDirection);
        currentDirection = currentDirection.rotateLeft();
        currentDirection = currentDirection.rotateLeft();
        currentDirection = currentDirection.rotateRight();
        currentDirection = currentDirection.rotateLeft();
        currentDirection = currentDirection.rotateLeft();
        currentDirection = currentDirection.rotateRight();
        currentDirection = currentDirection.rotateRight();
        currentDirection = currentDirection.rotateLeft();
        currentDirection = currentDirection.rotateLeft();
        Assert.assertEquals(Direction.E, currentDirection);
    }
}
