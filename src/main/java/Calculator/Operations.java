/**
 * Created by admin on 3/29/2018.
 */
package Calculator;
public class Operations {
    private final String operator;
    public Operations(String operator) {
        this.operator = operator;
    }
    public BinaryOperation getOper() throws InvalidOperationExceprion {
        switch (operator) {
            case "+":
                return new Summa();
            case "-":
                return new Substraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            case "^":
                return new Degree();
            case "log":
                return new Logarithm();
            case "root":
                return new Root();
            default:
                throw new InvalidOperationExceprion();

        }



    }
}
