package main.java;

import java.util.Arrays;

public class Planet {
    private int length;
    private int width;
    private int[][] grid;

    public Planet(int length, int width) {
        this.length = length;
        this.width = width;
        this.grid = new int[length][width];
        fillGrid();
    }

    public Planet(int[][] grid) {
        this.grid = grid;
        this.length = grid.length;
        this.width = grid[0].length;
        fillGrid();
    }

    private void fillGrid() {
        for (int i = 0; i < length; i++) {
            Arrays.fill(grid[i], 0);
        }
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


    // Adds an obstacle in the given coordinate
    public void addObstacle(int xCoordinate, int yCoordinate) {
        this.grid[yCoordinate][xCoordinate] = -1;
    }


    // Checks if the given coordinate has an obstacle
    public boolean hasObstacle(int xCoordinate, int yCoordinate) {
        return this.grid[yCoordinate][xCoordinate] == -1;
    }
}
