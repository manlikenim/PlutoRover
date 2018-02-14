package main.java;

public class Planet {
    private int length;
    private int width;
    private int[][] grid;

    public Planet(int length, int width) {
        this.length = length;
        this.width = width;
        this.grid = new int[length][width];
    }

    public Planet(int[][] grid) {
        this.grid = grid;
        this.length = grid.length;
        this.width = grid[0].length;
    }

    public Planet() {
        this(100, 100);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
