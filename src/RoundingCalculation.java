/**
 * Created by Evelina.
 */
public class RoundingCalculation {

    private double number;

    public RoundingCalculation() {
    }

    public RoundingCalculation(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double round (double number) {
        return (Math.round(number*100.0)/100.0);
    }
}
