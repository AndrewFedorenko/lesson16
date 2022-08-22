package random;

public class IntGenerator extends RandomContainer implements Generator<Integer>{
    @Override
    public Integer getNextRand() {
        return rnd.nextInt();
    }
    @Override
    public Class<Integer> getType() {
        return Integer.class;
    }
}
