import org.reflections.Reflections;
import org.reflections.scanners.Scanners;
import random.Generator;
import random.Matrix;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class TestMatrix {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Reflections ref = new Reflections("random", Scanners.SubTypes);
        Class<? extends Generator>[] genType = new Class[0];
        Class[]classArray = ref.getSubTypesOf(Generator.class).toArray(genType);
        Generator[] genObjectArray = new Generator[classArray.length];
        for (int i = 0; i < classArray.length; i++) {
            genObjectArray[i] = (Generator<? extends Number>) classArray[i].getDeclaredConstructor().newInstance();
        }
        Matrix matrix = new Matrix(getGenerator(genObjectArray), 5, 5);
        matrix.printMatrix();
    }

    static Generator getGenerator(Generator[] genObjectArray){
        return genObjectArray[new Random().nextInt(genObjectArray.length)];
    }

}
