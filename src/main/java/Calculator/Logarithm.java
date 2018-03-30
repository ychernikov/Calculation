/**
 * Created by admin on 2/27/2018.
 */
package Calculator;
public class Logarithm implements BinaryOperation {
    public double resultFor(double left, double right) {
        return Math.log(left)/Math.log(right);
    }
}
