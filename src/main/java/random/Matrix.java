package random;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix <T extends Number>{
    public T[][] matrix;
    public Matrix(Generator<T> generator, int rows, int columns){
        System.out.println(generator.getType().toString());
        matrix = (T[][]) Array.newInstance(generator.getType(),rows, columns);
        fillMatrix(generator);
    }
    private void fillMatrix(Generator<T> generator){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = generator.getNextRand();
            }
        }
    }
    public void printMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.deepToString(matrix[i]));
        }
    }
}
