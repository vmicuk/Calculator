/**
 * @author Evelina and Vitalij
 * @version 1.0
 * Created by Evelina
 */
public class Meniu {

    private String action;
    private double number1;
    private double number2;

    ArithmeticCalculation arithmetic = new ArithmeticCalculation();
    DigitsToNumeralSystemCalculation digits = new DigitsToNumeralSystemCalculation();
    DiscriminantCalculator discriminant = new DiscriminantCalculator();
    RoundingCalculation rounding = new RoundingCalculation();
    TrigonometryCalculator trigonometry = new TrigonometryCalculator();

    public void runArithmetic() {
        if(action.equals("add")) {
            arithmetic.add(number1, number2);
        }
        if(action.equals("subtract")){
            arithmetic.subtract(number1, number2);
        }
        if(action.equals("multiply")){
            arithmetic.multiply(number1, number2);
        }


    }
    
}
