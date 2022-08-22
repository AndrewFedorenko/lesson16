package random;

public class FloatGenerator extends RandomContainer implements Generator<Float>{
    @Override
    public Float getNextRand() {
        return rnd.nextFloat();
    }

    @Override
    public Class<Float> getType() {
        return Float.class;
    }
}

