/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package Calculator;
import static java.lang.Double.NaN;
/**

 * @author Andrey

 */
public class Calculator {

    static Parsing pars = new Parsing();

    public double calculate(double val1, double val2, String operator) {


        BinaryOperation operation = null;

        try {

            operation = new Operations(operator).getOper();

        } catch (InvalidOperationExceprion e) {

            System.out.println(e.toString());

            return NaN;

        }

        return operation.resultFor(val1, val2);

    }

    public static void main(String[] args) {

        String[] exp = null;
        double result = 0;

        try {

            exp = pars.parsingExp();

        } catch (InvalidOperationExceprion e) {

            System.out.println(e.getMessage());

            System.exit(1);

        }
        double left = 0;
        double right = 0;

        try {
            left = Double.parseDouble(exp[0]);
            right = Double.parseDouble(exp[2]);
        } catch (NumberFormatException nfe) {
            System.err.println(nfe.toString());
            result = NaN;
        }
        String operator = exp[1];
        Calculator calculator = new Calculator();
        result = calculator.calculate(left, right, operator);
        System.out.printf("result = %f%n", result);
    }
}