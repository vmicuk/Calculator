/**
 * Created by Evelina.
 */
public class RoundingCalculation {

    private double number;

    public RoundingCalculation() {
    }

    public double round (double number) {
        return (Math.round(number*100.0)/100.0);
    }
}
