//package com.ravi.coursera;
//
//import edu.princeton.cs.algs4.StdRandom;
//import edu.princeton.cs.algs4.StdStats;
//
//public class PercolationStats {
//
//    private final double mean;
//    private final double stddev;
//    private final double confidenceLo;
//    private final double confidenceHi;
//
//
//    // perform independent trials on an n-by-n grid
//    public PercolationStats(int n, int trials) {
//        if (n <= 0) {
//            throw new IllegalArgumentException("n should be greater than 0");
//        }
//        if (trials <= 0) {
//            throw new IllegalArgumentException("trials should be greater than 0");
//        }
//        double[] thresholds = new double[trials];
//        for (int i = 0; i < trials; i++) {
//            Percolation percolation = new Percolation(n);
//            int iterations = 0;
//            while (!percolation.percolates()) {
//                int row, column;
//                do {
//                    column = 1 + StdRandom.uniform(n);
//                    row = 1 + StdRandom.uniform(n);
//
//                } while (percolation.isOpen(row, column));
//                percolation.open(row, column);
//                iterations++;
//            }
//            thresholds[i] = iterations / (double) (n * n);
//        }
//
//        mean = StdStats.mean(thresholds);
//        stddev = StdStats.stddev(thresholds);
//        double confidenceFraction = (1.96 * stddev()) / Math.sqrt(trials);
//        confidenceLo = mean - confidenceFraction;
//        confidenceHi = mean + confidenceFraction;
//    }
//
//    // test client (see below)
//    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
//        int trials = Integer.parseInt(args[1]);
//
//        PercolationStats stats = new PercolationStats(n, trials);
//        System.out.println("mean                    = " + stats.mean());
//        System.out.println("stddev                  = " + stats.stddev());
//        System.out.println("95% confidence interval = " + stats.confidenceLo() + ", " + stats.confidenceHi());
//    }
//
//    // sample mean of percolation threshold
//    public double mean() {
//        return mean;
//    }
//
//    // sample standard deviation of percolation threshold
//    public double stddev() {
//        return stddev;
//    }
//
//    // low endpoint of 95% confidence interval
//    public double confidenceLo() {
//        return confidenceLo;
//    }
//
//    // high endpoint of 95% confidence interval
//    public double confidenceHi() {
//        return confidenceHi;
//    }
//
//}
