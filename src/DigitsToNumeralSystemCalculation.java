/**
 * Created by student on 17.3.6.
 */
public class DigitsToNumeralSystemCalculation {

    private int number;
    private int binary;

    public DigitsToNumeralSystemCalculation() {
    }

    public DigitsToNumeralSystemCalculation(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String binary(int number) {
        return Integer.toBinaryString(number & 0xFF);
    }
}
