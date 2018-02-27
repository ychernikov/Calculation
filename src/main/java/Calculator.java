public class Calculator {


    public double calculate(double val1, double val2, String operator) {

        BinaryOperation operation = getOperationFor(operator);



        if (operation == null) {

            System.out.println("Неизвестный оператор " + operator);

            return Double.NaN;

        }



        return operation.resultFor(val1, val2);

    }



    private BinaryOperation getOperationFor(String operator) {

        if ("+".equals(operator)) {

            return new Multiplication();

        } else if ("-".equals(operator)) {

            return new Substraction();
        }
        else if ("*".equals(operator)) {

            return new Substraction();
        }
        else if ("/".equals(operator)) {

            return new Substraction();
        }
        else if ("^".equals(operator)) {

            return new Substraction();
        }
        else if ("log".equals(operator)) {

            return new Substraction();
        }
        else if ("sqrt".equals(operator)) {

            return new Substraction();
        }



        return null;

    }



    public static void main(String[] args) {

        Calculator calculator = new Calculator();



        System.out.printf("Cложение %s%n", calculator.calculate(130, 24, "+") );
        System.out.printf("Вычитание %s%n", calculator.calculate(456.546, 545.5465, "-") );
        System.out.printf("Умножение%s%n", calculator.calculate(456.546, 545.5465, "*") );
        System.out.printf("Деление %s%n", calculator.calculate(456.546, 545.5465, "/") );
        System.out.printf("Возведеине в степень %s%n", calculator.calculate(456.546, 545.5465, "^"));
        System.out.printf("Логарифм по основанию %s%n", calculator.calculate(456.546, 545.5465, "log") );
        System.out.printf("корень N-степени из числа A%s%n", calculator.calculate(456.546, 545.5465, "sqrt") );

    }

}