package com.ravi.coursera;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;


public class Percolation {
    private final WeightedQuickUnionUF quickUnionUF;
    private final WeightedQuickUnionUF quickUnionUFIsFull;
    private final int virtualTopSite;
    private final int virtualBottomSite;
    private boolean[][] grid;
    private int openSites = 0;


    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 1");
        }
        grid = new boolean[n][n];
        quickUnionUF = new WeightedQuickUnionUF(n * n + 2);
        quickUnionUFIsFull = new WeightedQuickUnionUF(n * n + 1);
        virtualTopSite = 0;
        virtualBottomSite = n * n + 1;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        if (row < 1 || row > grid.length) {
            throw new IllegalArgumentException("row must be between 1 and n");
        }
        if (col < 1 || col > grid.length) {
            throw new IllegalArgumentException("col must be between 1 and n");
        }
        if (!isOpen(row, col)) {
            int exactIndex = getExactIndex(row, col);
            if (row == 1) {
                quickUnionUF.union(virtualTopSite, exactIndex);
                quickUnionUFIsFull.union(virtualTopSite, exactIndex);
            }
            if (row == grid.length) {
                quickUnionUF.union(virtualBottomSite, exactIndex);
            }
            connectIfOpen(row - 1, col, exactIndex);
            connectIfOpen(row + 1, col, exactIndex);
            connectIfOpen(row, col - 1, exactIndex);
            connectIfOpen(row, col + 1, exactIndex);
            grid[row - 1][col - 1] = true;
            openSites++;

        }
    }

    private void connectIfOpen(int row, int col, int exactIndex) {

        try {
            if (isOpen(row, col)) {
                int neighbourIndex = getExactIndex(row, col);
                quickUnionUF.union(neighbourIndex, exactIndex);
                quickUnionUFIsFull.union(neighbourIndex, exactIndex);
            }
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            // Do nothing
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if (row < 1 || row > grid.length) {
            throw new IllegalArgumentException("row must be between 1 and n");
        }
        if (col < 1 || col > grid.length) {
            throw new IllegalArgumentException("col must be between 1 and n");
        }
        return grid[row - 1][col - 1];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        if (isOpen(row, col)) {
            if (row < 1 || row > grid.length) {
                throw new IllegalArgumentException("row must be between 1 and n");
            }
            if (col < 1 || col > grid.length) {
                throw new IllegalArgumentException("col must be between 1 and n");
            }
            return quickUnionUFIsFull.connected(virtualTopSite, getExactIndex(row, col));
        }
        return false;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return openSites;
    }

    // does the system percolate?
    public boolean percolates() {
        return quickUnionUF.connected(virtualTopSite, virtualBottomSite);
    }

    private int getExactIndex(int p, int q) {
        return (p - 1) * grid.length + q;
    }

}
