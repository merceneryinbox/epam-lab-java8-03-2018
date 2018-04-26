package spliterators.exercise.exercise2;

import java.util.Spliterators;
import java.util.function.IntConsumer;

public class UnfairRectangleSpliterator extends Spliterators.AbstractIntSpliterator {
    private int[][] doubleIntAr;
    private int fromInclusive;
    private int toExclusive;
    /**
     * 0 1 2 3 4
     * ---------
     * 2 3 4 5 6
     * 2 4 5 6 7
     *
     * 0 1 2 3 4
     * 2 3 4 5 6
     * 2 4 5 6 7
     */
    public UnfairRectangleSpliterator(int[][] data) {
        this(data, 0, data.length);
        if (data.length == 0) {
            throw new UnsupportedOperationException("Matrix passed is not rectangle !");
        }
        int secondDimensionSize = 0;
        for (int[] aData : data) {
            secondDimensionSize = 0;
            for (int anAData : aData) {
                secondDimensionSize++;
            }
            if (aData.length != secondDimensionSize) {
                throw new UnsupportedOperationException("Matrix passed is not rectangle !");
            }
        }
    }

    private UnfairRectangleSpliterator(int[][] data, fromInclusive, toExclusive) {
        super(data.length, SIZED | IMMUTABLE | NONNULL | ORDERED);
        this.doubleIntAr = data;
    }

    @Override
    public OfInt trySplit() {

        throw new UnsupportedOperationException();
    }

    @Override
    public long estimateSize() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean tryAdvance(IntConsumer action) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(IntConsumer action) {
        throw new UnsupportedOperationException();
    }
}