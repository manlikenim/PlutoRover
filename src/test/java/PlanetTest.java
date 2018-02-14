package test.java;

import main.java.Planet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlanetTest {
    private Planet planet;

    @Before
    public void initialSetup() {
        this.planet = new Planet();
    }

    @Test
    public void hasCorrectLength() {
        Assert.assertEquals(100, planet.getLength());
    }

    @Test
    public void hasCorrectWidth() {
        Assert.assertEquals(100, planet.getWidth());

    }

    @Test
    public void canAddAnObstacle() {
        Assert.assertFalse(planet.hasObstacle(0,0));
        planet.addObstacle(0,0);
        Assert.assertTrue(planet.hasObstacle(0,0));
    }
}
