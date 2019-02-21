package nl.ica.oose.dea;

import java.util.stream.IntStream;

public class PrimeTestRunner {


    public void performPrimeTesting(PrimeTesterType type) {

        var primeTester = PrimeTesterFactory.getInstance().create(type);

        IntStream.range(0, 100).forEach(number -> {
            var isPrime = primeTester.testPrime(number);
            System.out.println("The number: " + number + " is prime? " + isPrime);
        });

    }


}
