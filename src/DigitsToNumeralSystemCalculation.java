/**
 * Created by Evelina007 O_o o_O ir Vitalij
 */
public class DigitsToNumeralSystemCalculation {

    private int number;
    private int binary;

    public DigitsToNumeralSystemCalculation() {
    }

    public String binary(int number) {
        return Integer.toBinaryString(number & 0xFF);
    }

    public String octal(int number){
        return  Integer.toOctalString(number & 0xFF);
    }
}
