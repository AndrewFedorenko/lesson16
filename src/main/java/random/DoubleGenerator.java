package random;

public class DoubleGenerator extends RandomContainer implements Generator<Double>{
    @Override
    public Double getNextRand() {
        return rnd.nextDouble();
    }

    @Override
    public Class<Double> getType() {
        return Double.class;
    }

}

