package nl.ica.oose.dea;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        var primetesterRunner = new PrimeTestRunner();
        primetesterRunner.performPrimeTesting(PrimeTesterType.SUPERFAST);

        primetesterRunner.performPrimeTesting(PrimeTesterType.MORECOMPLETE);
    }
}
