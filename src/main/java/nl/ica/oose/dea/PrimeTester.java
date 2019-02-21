package nl.ica.oose.dea;

public class PrimeTester implements IPrimeTester {

    public Boolean testPrime(int number) {
        switch (number) {
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            case 13:
            case 17:
            case 19:
            case 23:
                return true;
            case 1:
            case 4:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 20:
                return false;
            default:
                return null;
        }
    }
}
