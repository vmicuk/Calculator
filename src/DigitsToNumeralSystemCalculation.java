/**
 * Created by Evelina ir Vitalij.
 */
public class DigitsToNumeralSystemCalculation {

    private int number;
    private int binary;

    public DigitsToNumeralSystemCalculation() {
    }

    public String binary(int number) {
        return Integer.toBinaryString(number & 0xFF);
    }

    public String hex(int number){
        return Integer.toHexString (number & 0xFF);
    }
}
