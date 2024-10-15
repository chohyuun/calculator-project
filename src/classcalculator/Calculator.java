package classcalculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private double result = 0;
    private final Queue<Double> queue = new LinkedList<>();

    private void calculate(double operand1, double operand2, String operation) {
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
                throw new OperationException("사용 가능한 연산자를 입력해 주세요.");
        }
        queue.add(result);
    }

    // Queue 데이터 삭제 메소드
    public void removeResult() {
        queue.poll();
    }

    public void setCalculate(double operand1, double operand2, String operation) {
        calculate(operand1, operand2, operation);
    }

    public double getResult() {
        return this.result;
    }
}
