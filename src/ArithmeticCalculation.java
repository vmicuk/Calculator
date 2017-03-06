/**
 * Created by Evelina
 */
public class ArithmeticCalculation {

    private double numberOne;
    private double numberTwo;

    public ArithmeticCalculation(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public double add (double numberOne, double numberTwo) {
        return numberOne + numberOne;
    }

    public double subtract (double numberOne, double numberTwo) {
        return numberOne - numberOne;
    }

    public double multiply (double numberOne, double numberTwo) {
        return numberOne*numberOne;
    }

    public double divide (double numberOne, double numberTwo) {
        return numberOne/numberOne;
    }


}
