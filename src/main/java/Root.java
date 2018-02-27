/**
 * Created by admin on 2/27/2018.
 */
public class Root implements BinaryOperation {
    public double resultFor(double left, double right) {
        return Math.pow(left, 1.0/right);
    }
}
