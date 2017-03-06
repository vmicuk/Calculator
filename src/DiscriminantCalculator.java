/**
 * Created by stsudent on 17.3.6.
 */
public class DiscriminantCalculator {
    private int a;
    private int b;
    private int c;
    private int d;
    private double discriminant;
    private double x1;
    private double x2;

    public DiscriminantCalculator() {
    }

    public void Discriminant(int a, int b, int c, int d){
        if (a == 0 || b == 0 || c ==0) {
            System.out.println("Lygtis ne kvadratine");
        }
        else {
            discriminant = (b*b) - (4*a*c - d);
            if (discriminant > 0) {
                x1 = (-b + Math.sqrt(discriminant))/2*a;
                System.out.println("x1:" + x1);
                x2 = (-b - Math.sqrt(discriminant))/2*a;
                System.out.println("x2" + x2);
            }
            else if (discriminant < 0) {
                System.out.println("Lygtis sprendimu neturi");
            }
            else {
                x1 = -(b/2*a);
                System.out.println("Lygtis turi tik viena sprendima: " + x1);
            }
        }
    }
}
