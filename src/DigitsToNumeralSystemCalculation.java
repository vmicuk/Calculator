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

    public String octal(int number){
        return Integer.toOctalString(number & 0xFF);
    }





    public long octalToInt(String number){
        return Long.parseLong(number, 8);
    }

    public long hexToInt(String number){
        return Long.parseLong(number, 16);
    }









    public long binaryToInt(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }

}
