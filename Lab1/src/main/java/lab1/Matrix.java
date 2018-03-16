package lab1;

import java.math.BigDecimal;
import java.util.Arrays;
import Jama.*;

public class Matrix {

    private int rows;
    private int cols;
    private double[][] data;

    Matrix(int rows, int cols){
        if(rows <= 0) throw new IllegalArgumentException("Rows must be positive number!");
        else if(cols <= 0) throw new IllegalArgumentException("Cols must be positive number!");
        else {
            this.rows = rows;
            this.cols = cols;
            this.data = new double[rows][cols];
        }
    }


    Matrix(double[][] data) {
        this(data.length, data[0].length);
        if(!isCorrectRowsLength(data)) throw new IllegalArgumentException("All rows must have the same length.");

        for (int i = 0; i < rows; i++) System.arraycopy(data[i], 0, this.data[i], 0, cols);
    }

    public void fillByRandom(double min, double max){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++) data[i][j] = Math.random() * (max - min) + min;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return rows == matrix.rows &&
                cols == matrix.cols &&
                matrixDataEquals(data, matrix.data);
    }

    private boolean matrixDataEquals(double[][] data1, double[][] data2){
        for (int i = 0; i < data1.length; i++){
            if(!Arrays.equals(data1[i], data2[i])) return false;
        }
        return true;
    }


    @Override
    public String toString() {
        StringBuilder matrixString = new StringBuilder("----------" +
                "\nMatrix\n");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                matrixString.append(String.format("%-8.2f", data[i][j]));
            }
            matrixString.append('\n');
        }
        return matrixString.append("----------").toString();
    }

    public Matrix transpose(){
        Matrix result = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++) result.data[j][i] = this.data[i][j];
        }
        return result;
    }

    public Matrix divideByScalar(double scalar){
        if(new Double(scalar).equals(BigDecimal.ZERO.doubleValue())){
            throw new IllegalArgumentException("Can't divide by zero");
        }

        Matrix result = new Matrix(rows, cols);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++) result.data[i][j] = this.data[i][j] / scalar;
        }
        return result;
    }

    public int rank() {
        Jama.Matrix matrix = new Jama.Matrix(data);
        SingularValueDecomposition svd = new SingularValueDecomposition(matrix);
        return svd.rank();
    }

    public int getRowDimension(){
        return rows;
    }

    public int getColDimension(){
        return cols;
    }

    private boolean isCorrectRowsLength(double[][] data){
        int cols = data[0].length;
        for (double[] row : data){
            if (row.length != cols) return false;
        }
        return true;
    }

}
