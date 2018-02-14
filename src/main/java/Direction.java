package main.java;

public enum Direction {
    // Four directions along with their respective x and y directional
    // components
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
}
