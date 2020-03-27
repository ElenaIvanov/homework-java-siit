package com.siit.week03;

public class MatrixMultiplication {
    double[][] firstMatrix = {{ 4.00, 3.00 },
                              { 2.00, 1.00 },
                              { 6.00, 4.00 }};
    double[][] secondMatrix = {{ 4.00, 3.00 },
                               { 2.00, 1.00 },
                               { 6.00, 4.00 }};

    public static void main(String[] args) {
        MatrixMultiplication matrix = new MatrixMultiplication();
        double[][] result = matrixMultiply(matrix.firstMatrix, matrix.secondMatrix);

        for(int i = 0; i<2; i++) {
            for(int j = 0; j<2; j++) {
                System.out.println(result[i][j]);
            }
        }

    }

    public static double[][] matrixMultiply(double[][] firstMatrix, double[][] secondMatrix) {
        int firstMRows = firstMatrix.length;
        int firstMColumns = firstMatrix[0].length;
        int secondMRows = secondMatrix.length;
        int secondMColumns = secondMatrix[0].length;

        if (firstMColumns != secondMRows) {
            throw new IllegalArgumentException("First Matrix Rows: " + firstMRows + " did not match Second Matrix Columns " + secondMColumns + ".");
        }

        double[][] thirdMatrix = new double[firstMRows][secondMColumns];
        for (int i = 0; i < firstMRows; i++) {
            for (int j = 0; j < secondMColumns; j++) {
                thirdMatrix[i][j] = 0.00000;
            }
        }
            for (int i = 0; i < firstMRows; i++) { // first matrix rows
                for (int j = 0; j < secondMColumns; j++) { // second matrix column
                    for (int k = 0; k < firstMColumns; k++) { // first matrix column
                        thirdMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                }
            }
        return thirdMatrix;
    }
}
