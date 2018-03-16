package lab1;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void testConstructorNegativeRowsAndCols(){
        assertThrows(IllegalArgumentException.class, () -> {
           new Matrix(3, -3);
        }, "Cols must be positive number!");

        assertThrows(IllegalArgumentException.class, () -> {
            new Matrix(-1, 3);
        }, "Rows must be positive number!");

        assertThrows(IllegalArgumentException.class, () -> {
            new Matrix(-1, -3);
        }, "Rows must be positive number!");
    }


    @Test
    void testConstructorGearArray(){
        assertThrows(IllegalArgumentException.class, () -> {
            double[][] data = {{4, 5, 3}, {1, 3}, {2, 5}};
            new Matrix(data);
        }, "All rows must have the same length.");
    }

    @Test
    void testConstructor(){
        int rows = 3;
        int cols = 7;
        Matrix m1 = new Matrix(rows, cols);

        assertEquals(m1.getRowDimension(), rows);
        assertEquals(m1.getColDimension(), cols);

        Matrix m2 = new Matrix(new double[][]{
                {3.2, -5.8, -6.1, 7.6},
                {1.34, 4.12, 8.56, -2.45}
        });

        assertEquals(m2.getRowDimension(), 2);
        assertEquals(m2.getColDimension(), 4);
    }

    @Test
    void testEquals(){
        Matrix m1 = new Matrix(new double[][]{
                {2.4, 5.5},
                {1.7, 1.9},
                {7.233, 6.23}
        });

        //create matrix2 data same as data of matrix1
        Matrix m2 = new Matrix(new double[][]{
                {2.4, 5.5},
                {1.7, 1.9},
                {7.233, 6.23}
        });

        Matrix m3 = new Matrix(new double[][]{
                {2.45, 5.5},
                {1.7, 1.9},
                {7.233, 6.23}
        });

        Matrix m4 = new Matrix(4, 2);

        assertEquals(m1, m2);
        assertNotEquals(m1, m3);
        assertNotEquals(m1, m4);
        assertFalse(m1.equals(null));
        assertFalse(m1.equals(new String("Another class")));
        assertEquals(m1, m1);
    }

    @Test
    void testTranspose(){
        //create matrix1
        Matrix m1 = new Matrix(new double[][]{
                {2.4, 5.5},
                {1.7, 1.9},
                {7.233, 6.23}
        });
        Matrix m1Transposed = m1.transpose();

        assertEquals(m1.getRowDimension(), m1Transposed.getColDimension());
        assertEquals(m1.getColDimension(), m1Transposed.getRowDimension());

        //create matrix2 with transposed data
        Matrix m2 = new Matrix(new double[][]{
                {2.4, 1.7, 7.233},
                {5.5, 1.9, 6.23}
        });

        assertEquals(m1Transposed, m2);

        Matrix m3 = new Matrix(new double[][]{
                {2.4, 1.7},
                {5.5, 1.9}
        });

        assertNotEquals(m1Transposed, m3);
    }

    @Test
    void testDivisionOnScalar(){
        Matrix m1 = new Matrix(new double[][]{
                {2.4, 5.6},
                {1.1, 2},
                {7.2, 6.4}
        });

        double scalar = 2.5;
        Matrix m2 = new Matrix(new double[][]{
                {2.4 / scalar, 5.6 / scalar},
                {1.1 / scalar, 2 / scalar},
                {7.2 / scalar, 6.4 / scalar}
        });

        assertEquals(m1.divideByScalar(scalar), m2);


        scalar = -0.23;
        Matrix m3 = new Matrix(new double[][]{
                {2.4 / scalar, 5.6 / scalar},
                {1.1 / scalar, 2 / scalar},
                {7.2 / scalar, 6.4 / scalar}
        });

        assertEquals(m1.divideByScalar(scalar), m3);
    }

    @Test
    void testDivisionOnZero(){
        double zero = 0.0;

        assertThrows(IllegalArgumentException.class, () -> {
            Matrix m = new Matrix(3, 2);
            m.fillByRandom(1, 4);
            m.divideByScalar(zero);
        }, "Can't divide by zero");
    }

    @Test
    void testRank(){
        Matrix m1 = new Matrix(new double[][]{
                {2, 5, 1},
                {4, 2, 1},
                {6, 8, 12}
        });
        assertEquals(m1.rank(), 3);


        Matrix m2 = new Matrix(new double[][]{
                {1, 3},
                {3, 9},
                {12, 344},
                {134, 776}
        });
        assertEquals(m2.rank(), 2);


        Matrix m3 = new Matrix(new double[][]{
                {2, 3, 1, 45, 2},
                {0, 0, 2.1, 1.5, 3},
                {0, 0, 6.3, 4.5, 9}
        });

        assertEquals(m3.rank(), 2);

        Matrix m4 = new Matrix(4, 3);
        assertEquals(m4.rank(), 0);
    }

    @Test
    void testToString(){
        Matrix m = new Matrix(new double[][]{
                {3.12, 5.5},
                {2.1, 1}
        });
        String matrixString = "----------\nMatrix\n3.12    5.50    \n2.10    1.00    \n----------";

        assertEquals(m.toString(), matrixString);
    }
}