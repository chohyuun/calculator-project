package classcalculator;

public class Calculator {
    private double result = 0;

    public double calculate(double operand1, double operand2, String operation) {
        switch (operation) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            case "%":
                result = operand1 % operand2;
                break;
            default:
                // 틀린 연산자 입력의 경우 예외 처리
                System.out.println("사용 가능한 연산자를 입력해 주세요.");
                break;
        }

        return result;
    }
}
