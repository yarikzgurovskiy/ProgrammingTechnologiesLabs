public class MatrixParsing {
    static Matrix parse(String matrixString) {
        matrixString = matrixString.substring(1, matrixString.length() - 1);

        int rows = 0;
        for (char c : matrixString.toCharArray()) {
            if (c == '[') rows++;
        }
        double[][] rawMatrix = new double[rows][];

        for (int i = 0, ob = matrixString.indexOf('['); ob != -1; i++, ob = matrixString.indexOf('[')) {
            int cb = matrixString.indexOf(']');
            String separatedNumbers = matrixString.substring(ob + 1, cb);
            String[] numbers = separatedNumbers.split(",");
            rawMatrix[i] = new double[numbers.length];
            for (int j = 0; j < numbers.length; j++) {
                rawMatrix[i][j] = Double.parseDouble(numbers[j]);
            }
            matrixString = matrixString.substring(cb + 1, matrixString.length());
        }
        return new Matrix(rawMatrix);
    }
}
