package nl.ica.oose.dea;

import org.apache.commons.math3.primes.Primes;

public class PrimeTesterFactory {

    private static PrimeTesterFactory factory;

    public static PrimeTesterFactory getInstance() {
        if (factory == null) {
            factory = new PrimeTesterFactory();
        }

        return factory;
    }

    public IPrimeTester create(PrimeTesterType type) {
        switch (type) {
            case SUPERFAST:
                return new PrimeTester();
            case MORECOMPLETE:
                return new ApachePrimesAdapter();
            default:
                return null;
        }

    }
}
