package main.java;

public enum Direction {
    // Four directions along with their respective x and y directional
    // components arranged in a way so that next value is obtained by
    // rotating the current value by 90 degrees clockwise
    N(0, 1), E(1, 0), S(0, -1), W(-1, 0);

    private int xComponent;
    private int yComponent;

    Direction(int xComponent, int yComponent) {
        this.xComponent = xComponent;
        this.yComponent = yComponent;
    }

    public int getxComponent() {
        return xComponent;
    }

    public int getyComponent() {
        return yComponent;
    }

    // Return the next value in the values chain. If the current value is the
    // last element, return the first element.
    public Direction rotateRight() {
        int numValues = values().length;
        return values()[(ordinal() + numValues + 1) % numValues];
    }

    // Return the previous value in the values chain. If the current value is
    // the first element, return the last element.
    public Direction rotateLeft() {
        int numValues = values().length;
        return values()[(ordinal() + numValues - 1) % numValues];
    }
}