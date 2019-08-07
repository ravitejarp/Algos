package com.ravi.com.ravi.generalProblems;

public class GameOfLife {

    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        int[][] currentGen = new int[3][3];
        currentGen[0][0] = 0;
        currentGen[0][1] = 1;
        currentGen[0][2] = 0;
        currentGen[1][0] = 1;
        currentGen[1][1] = 0;
        currentGen[1][2] = 1;
        currentGen[2][0] = 0;
        currentGen[2][1] = 1;
        currentGen[2][2] = 0;
        int[][] nextGen = gameOfLife.getNextGen(currentGen);
        System.out.print("[");
        for (int i = 0; i < nextGen.length; i++) {
            for (int j = 0; j < nextGen.length; j++) {
                System.out.print(nextGen[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("]");
    }

    public int getNextGeneration(int row, int col, int[][] currentLife) {
        int newLife = 0;
        if (row > 0) {
            newLife += currentLife[row - 1][col];
            if (col < currentLife.length - 1) {
                newLife += currentLife[row - 1][col + 1];
            }
        }
        if (col > 0) {
            newLife += currentLife[row][col - 1];
            if (row < currentLife.length - 1) {
                newLife += currentLife[row + 1][col - 1];
            }
        }
        if (row > 0 && col > 0) {
            newLife += currentLife[row - 1][col - 1];
        }
        if (row + 1 <= currentLife.length - 1) {
            newLife += currentLife[row + 1][col];
        }
        if (col + 1 <= currentLife.length - 1) {
            newLife += currentLife[row][col + 1];
        }
        if (row + 1 <= currentLife.length - 1 && col + 1 <= currentLife.length - 1) {
            newLife += currentLife[row + 1][col + 1];
        }


        return newLife == 2 ? 1 : 0;
    }

    public int[][] getNextGen(int[][] current) {
        int[][] newGen = new int[current.length][current.length];
        if (current == null || current.length == 0) {
            return current;
        }
        for (int i = 0; i < current.length; i++) {
            for (int j = 0; j < current.length; j++) {
                newGen[i][j] = getNextGeneration(i, j, current);
            }
        }
        return newGen;
    }
}
