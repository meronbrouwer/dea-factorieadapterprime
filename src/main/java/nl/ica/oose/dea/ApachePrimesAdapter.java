package nl.ica.oose.dea;

import org.apache.commons.math3.primes.Primes;

public class ApachePrimesAdapter implements IPrimeTester {

    @Override
    public Boolean testPrime(int number) {
        return Primes.isPrime(number);
    }
}
