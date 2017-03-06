/**
 * Created by Evelina ir Vitalij.
 */
public class DigitsToNumeralSystemCalculation {
    
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

    public long binaryToInt(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }

    public long octalToInt(String number){
        return Long.parseLong(number, 8);
    }

    public long hexToInt(String number){
        return Long.parseLong(number, 16);
    }
}
