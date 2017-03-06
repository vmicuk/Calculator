/**
 * Created by stsudent on 17.3.6.
 */
public class TrigonometryCalculator {

    private double number;

    public TrigonometryCalculator() {
    }

    public double sinA(double number){
        return Math.sin(number);
    }

    public double cosA(double number){
        return Math.cos(number);
    }

    public double tgA(double number) {
        return Math.tan(number);
    }

    public double ctgA(double number) {
        return 1.0/Math.tan(number);
    }

}
